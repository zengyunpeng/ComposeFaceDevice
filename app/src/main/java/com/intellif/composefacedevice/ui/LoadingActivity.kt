package com.intellif.composefacedevice.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.intellif.arctern.FaceUtils
import com.intellif.composefacedevice.R
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
            content()
        }
//        initEvent()
    }

    @SuppressLint("UnsafeOptInUsageError")
    @Preview
    @Composable
    fun content() {
        Box(
            Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            Image(
                modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                painter = painterResource(R.mipmap.loading_bg),
                contentDescription = ""
            )

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(modifier = Modifier.width(200.dp).height(200.dp)) {
                    AndroidView(
                        factory = {
                            ImageView(it).apply {
                                setImageResource(R.drawable.shape_white_circle)
                                scaleType = ImageView.ScaleType.FIT_XY
                            }
                        },
                        modifier = Modifier.fillMaxWidth().fillMaxHeight()
                    )


                    Text(
                        text = "0%",
                        fontSize = 24.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        modifier = Modifier/*.width(200.dp).height(200.dp)*/
                            .align(Alignment.Center),
                    )

                }
                Spacer(modifier = Modifier.height(100.dp))
                Text(
                    "系统启动中...",
                    fontSize = 40.sp,
                    color = Color.White,
                    modifier = Modifier.padding(bottom = 40.dp)
                )
            }
        }

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

@Composable
fun LoadingActivity.content() {

}