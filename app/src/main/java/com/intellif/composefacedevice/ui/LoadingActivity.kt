package com.intellif.composefacedevice.ui

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.hjq.permissions.OnPermissionCallback
import com.hjq.permissions.XXPermissions
import com.intellif.arctern.FaceUtils
import com.intellif.composefacedevice.R
import com.intellif.composefacedevice.vm.LoadingViewModel
import com.intellif.utils.Constants
import com.intellif.utils.FileIOUtils
import com.intellif.utils.ToastUtil
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import java.io.File

class LoadingActivity : AppCompatActivity() {
    val vm: LoadingViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            content(vm)
        }
        initEvent()
        startObserver()
    }

    private fun startObserver() {
        vm.mProgress.observe(this) {
            if (it == 100) {
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }

    @SuppressLint("UnsafeOptInUsageError")
    @Preview(widthDp = 800, heightDp = 1280)
    @Composable
    fun content(loadingViewModel: LoadingViewModel = LoadingViewModel()) {
        Box(
            Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            Image(
                modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                painter = painterResource(R.mipmap.loading_bg),
                contentDescription = "",
                contentScale = ContentScale.FillBounds
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
                        text = "${loadingViewModel.mProgress.observeAsState().value}%",
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
        XXPermissions.with(this)
            .permission(
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.CAMERA
            )
            .request { _, all ->
                if (all) {
                    vm.initSDK()
                    vm.startSDK()
                } else {
                    ToastUtil.showToast("请在系统设置中授予相关权限")
                }
            }

    }


}

@Composable
fun LoadingActivity.content() {

}