package com.intellif.composefacedevice.utils

import com.intellif.composefacedevice.BuildConfig
import com.intellif.composefacedevice.constant.MODEL_VERSION
import com.intellif.utils.AppGlobals
import com.intellif.utils.AssetsUtil
import com.intellif.utils.AssetsUtil.copyDirFromAssets
import com.intellif.utils.Constants
import com.intellif.utils.FileUtils
import java.io.File

/**
 * 云天sdk初始化管理器
 *
 */
object SDKManager {

    fun initSDK() {
        File(Constants.SDK_PATH).apply {
            if (exists()) {
                //版本升级时候更新model文件夹,更新检测模型
                val modelVersionCode: Int = KvUtil.decodeInt(MODEL_VERSION)
                if (modelVersionCode < BuildConfig.VERSION_CODE) {
                    //删除原有模型
                    val modelDir = File(Constants.MODEL_PATH)
                    if (modelDir.exists()) {
                        FileUtils.deleteAllInDir(modelDir)
                    }
                    //拷贝新的模型
                    copyDirFromAssets(
                        AppGlobals.getApplication(),
                        Constants.INTELLIF_NAME + File.separator + Constants.MODEL_NAME,
                        Constants.MODEL_PATH
                    )
                    KvUtil.encode(MODEL_VERSION, BuildConfig.VERSION_CODE)
                }
            } else {
                AssetsUtil.exportInitData()
                KvUtil.encode(MODEL_VERSION, BuildConfig.VERSION_CODE)
            }
        }
    }
}