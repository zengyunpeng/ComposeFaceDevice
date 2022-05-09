package com.intellif.composefacedevice.vm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.intellif.arctern.FaceUtils
import com.intellif.dblib.DBManager
import com.intellif.utils.Constants
import com.intellif.utils.FileIOUtils
import com.intellif.utils.ToastUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.File

class LoadingViewModel : ViewModel() {
    val TAG = "LoadingViewModel";
    val mProgress = MutableLiveData<Int>(0)

    fun initSDK() {
        viewModelScope.launch {
//            initSDKAsy()
        }

    }


    @Suppress("RedundantSuspendModifier")
    private suspend fun initSDKAsy() {
//        SDKManager.cpSDK()
    }


    fun startSDK() {
        val file = File(Constants.FILE_LICENSE_PATH)
        if (!file.exists() || file.length() != 704L) {
            val result = FaceUtils.getInstance().arcternsdk_fetch_license(
                Constants.FILE_LICENSE_PATH,
                Constants.LICENSE_API_KEY,
                Constants.LICENSE_API_SECRET
            )

        }
        if (file.exists() && file.length() == 704L) {
            startSDKServer()
        } else {
            val signature: String = FaceUtils.getInstance().arcternsdk_about()
            Log.i("tag", "signature :$signature")
            FileIOUtils.writeFileFromString(File(Constants.FILE_SIGNATURE_PATH), signature)
            ToastUtil.showToast("license获取失败")
        }
    }

    //启动SDK服务
    fun startSDKServer() {
        Log.i(TAG, "startSDKServer: " + Thread.currentThread())
        //异步启动SDK

        viewModelScope.launch(context = Dispatchers.Main) {
            Log.i(TAG, "协程启动的线程: " + Thread.currentThread())
            val arcternSdkAccessCode = withContext(Dispatchers.IO) { startArctern() }
            if (arcternSdkAccessCode != 0) {
                ToastUtil.showToast("ArcternSDK初始化SDK失败...")
            }
//            val arcternSdkAccessCode = startArctern()

            ToastUtil.showToast("ArcternSDK初始化成功: $arcternSdkAccessCode...")
            //加载数据库
            val loadFinished = withContext(Dispatchers.IO) { loadDbToArctern() }
            if(loadFinished){
                Log.i(TAG, "暂停两秒")
                delay(100)
                mProgress.value = 100
            }

        }

    }

    @Suppress("RedundantSuspendModifier")
    private suspend fun loadDbToArctern() :Boolean{
        Log.i(TAG, "loadDbToArctern: " + Thread.currentThread().name)
        val dbManager = DBManager.getInstance()
        val count = dbManager.countPerson()

        var index = 0
        while (index < count) {
            val personOffset2 = dbManager.getPersonOffset2(index)
            for (i in personOffset2.indices) {
                val dbPerson = personOffset2[i]
                var result = 0
                if (dbPerson.feature != null) {
                    //这里有个NDK 崩溃  TODO
                    if (dbPerson.feature == null) {
                        result = -1000
                    }
                    result = FaceUtils.getInstance()
                        .arcternsdk_access_database_add(dbPerson.id, dbPerson.feature)
                }
                index++
                val i1: Float = index / count as Float
                var progress = (i1 * 100).toInt()
                if (progress == 0) {
                    progress = 1
                }
                mProgress.postValue(progress)
            }
        }
        Log.i(TAG, "数据库加载完成")
        return true
    }


    @Suppress("RedundantSuspendModifier")
    private suspend fun startArctern(): Int {
        delay(5000)
        Log.i(TAG, "startArctern*****" + Thread.currentThread())
        return FaceUtils.getInstance().arcternsdk_access_run(Constants.FILE_CONFIG_PATH)//如果返回0表示成功了
    }

}