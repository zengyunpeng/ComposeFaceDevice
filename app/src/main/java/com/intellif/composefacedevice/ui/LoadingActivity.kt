package com.intellif.composefacedevice.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.util.Log
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.intellif.arctern.FaceUtils
import com.intellif.composefacedevice.vm.LoadingViewModel
import com.intellif.utils.Constants
import com.intellif.utils.FileIOUtils
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.io.File

class LoadingActivity : AppCompatActivity() {
    val vm by viewModel<LoadingViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
        initEvent()
    }

    private fun initEvent() {
        vm.initSDK()
        checkSDKLicense()
    }

    fun checkSDKLicense() {
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
        }
    }

    var handler = @SuppressLint("HandlerLeak")
    object : Handler() {
        override fun handleMessage(msg: Message) {
            Toast.makeText(this@LoadingActivity, "sdk初始化成功", Toast.LENGTH_SHORT).show()
            //跳转到首页
            startActivity(Intent(this@LoadingActivity, MainActivity::class.java))
            finish()
        }
    }

    //启动SDK服务
    fun startSDKServer() {
        //异步启动SDK
        object : Thread() {
            override fun run() {
                super.run()
                val arcternsdkAccessRun =
                    FaceUtils.getInstance()
                        .arcternsdk_access_run(Constants.FILE_CONFIG_PATH)//如果返回0表示成功了
                handler.sendEmptyMessage(0)
            }
        }.start()
    }


}