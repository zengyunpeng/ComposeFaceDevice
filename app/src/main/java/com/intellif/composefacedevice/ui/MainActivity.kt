package com.intellif.composefacedevice.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.intellif.arctern.FaceUtils
import com.intellif.composefacedevice.R
import com.intellif.composefacedevice.ui.vm.MainVm
import com.intellif.composefacedevice.view.FaceView
import com.intellif.composefacedevice.view.LivingSurfaceView
import com.intellif.composefacedevice.view.preview.LivingInterface1

class MainActivity : ComponentActivity() {
    val mainVm: MainVm by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content(mainVm)
        }
//        mainVm.faceRecs.observeAsState()
        startSDKDetectServer()
        initState()
    }

    private fun initState() {

    }

    private fun startSDKDetectServer() {
        FaceUtils.getInstance().arcternsdk_access_set_detect_cbf(mainVm) //检测 这个回调暂时空实现
        FaceUtils.getInstance().arcternsdk_access_set_track_cbf(mainVm) //追踪
        FaceUtils.getInstance().arcternsdk_access_set_search_cbf(mainVm) //搜索
        FaceUtils.getInstance().arcternsdk_access_set_filt_cbf(mainVm) //筛选
        LivingInterface1.getInstance().setLivingCallBack(mainVm)
    }


    var frameTime = 0L

    @SuppressLint("UnsafeOptInUsageError")
    @Preview(widthDp = 800, heightDp = 1280)
    @Composable
    fun Content(mainVm: MainVm = MainVm()) {//预览运行时要获取到vm,这里传入一个默认的才能预览
        Box {
            AndroidView(
                { context ->
                    LivingSurfaceView(context, null)
                },

                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
            )
            val faceRecs = mainVm.faceRecs.observeAsState()
            AndroidView(
                factory = { context ->
                    FaceView(context, null)
                },
                modifier = Modifier.fillMaxHeight().fillMaxWidth(),
                update = {
                    it.setFaces(
                        faceRecs.value,
                        480,
                        640,
                        800,
                        1280,
                        setRecongize
                    )
                }
            )


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(color = Color.Black),
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                /*ip和库内人数*/
                Column(
                    modifier = Modifier.fillMaxHeight().wrapContentWidth().padding(start = 10.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    /*网络连接状态*/
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(R.mipmap.net_unconnect),
                            contentDescription = "",
                            modifier = Modifier.width(18.dp).height(18.dp)
                        )
                        Text(
                            "0.0.0.0",
                            color = Color.White,
                            modifier = Modifier.padding(start = 5.dp),
                            fontSize = 12.sp
                        )
                    }
                    /*人脸库人数*/
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(top = 2.dp)
                    ) {
                        Image(
                            painter = painterResource(R.mipmap.icon_db_person),
                            contentDescription = "",
                            modifier = Modifier.width(18.dp).height(18.dp).padding(top = 2.dp)
                        )
                        Text(

                            "0",
                            color = Color.White,
                            modifier = Modifier.padding(start = 5.dp),
                            fontSize = 12.sp
                        )
                    }


                }

                /*日期和时间*/
                Column(
                    modifier = Modifier.fillMaxHeight().wrapContentWidth().padding(end = 10.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.End
                ) {
                    /*日期*/
                    Text(
                        text = "2020-10-15 星期四",
                        color = Color.White,
                        fontSize = 18.sp
                    )
                    /*时间*/
                    Text(
                        text = "15:30:59",
                        color = Color.White,
                        fontSize = 25.sp
                    )
                }

            }


        }
    }


    var setRecongize = HashSet<Long>()


}
