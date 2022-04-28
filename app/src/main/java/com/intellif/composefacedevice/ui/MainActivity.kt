package com.intellif.composefacedevice.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.camera.view.PreviewView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.intellif.arctern.FaceUtils
import com.intellif.arctern.base.*
import com.intellif.composefacedevice.R
import com.intellif.composefacedevice.camera.CameraXHelper
import com.intellif.composefacedevice.view.FaceView
import com.theeasiestway.yuv.YuvUtils
import kotlinx.coroutines.flow.MutableStateFlow

class MainActivity : ComponentActivity(), DetectCallBack, TrackCallBack, SearchCallBack,
    AttributeCallBack {
    private val yuvUtils = YuvUtils()
    var faceRec = MutableStateFlow<Array<FaceView.DrawRect>?>(null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
        }
    }

    var frameTime = 0L

    @SuppressLint("UnsafeOptInUsageError")
    @Preview
    @Composable
    fun Content() {
        Box {
            AndroidView(
                { context ->
                    PreviewView(context)
                        .apply {
                            CameraXHelper(
                                getContext(),
                                getContext() as MainActivity,
                                this,
                            ) {
                                if (System.currentTimeMillis() - frameTime > 66.6) {
                                    frameTime = System.currentTimeMillis()
                                    var yuvFrame = yuvUtils.convertToI420(it.image!!)
                                    //对图像进行旋转
                                    yuvFrame = yuvUtils.rotate(yuvFrame, 90)
                                    val arcternImage = ArcternImage()
                                    arcternImage.image_format =
                                        ArcternImage.ARCTERN_IMAGE_FORMAT_YUV420
                                    arcternImage.frame_id = it.imageInfo.timestamp
                                    arcternImage.gdata = yuvFrame.asArray()
                                    arcternImage.width = 480
                                    arcternImage.height = 640
                                    Log.i("tag", "向arcternSDK传递数据...")
                                    FaceUtils.getInstance()
                                        .arcternsdk_access_delivery_trackonly(arcternImage)
                                }
                            }
                        }
                },
                modifier = Modifier
//                .width(640.dp)
//                .height(480.dp)
                    .fillMaxHeight()
                    .fillMaxWidth()
            )
            AndroidView({ context ->
                FaceView(context, null).apply {
                    setFaces(faceRec.value, 800, 1280, 800, 1280, setRecongize)
                }
            }, modifier = Modifier.fillMaxHeight().fillMaxWidth())


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

                            "10人",
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
        startArcternSdk()

    }

    private fun startArcternSdk() {
        FaceUtils.getInstance().arcternsdk_access_set_detect_cbf(this)
        FaceUtils.getInstance().arcternsdk_access_set_track_cbf(this)
        FaceUtils.getInstance().arcternsdk_access_set_search_cbf(this)
        FaceUtils.getInstance().arcternsdk_access_set_filt_cbf(this)

    }

    var setRecongize = HashSet<Long>()
    override fun onDetectListener(p0: ArcternImage?, p1: Array<out ArcternRect>?, p2: FloatArray?) {
        TODO("Not yet implemented")
    }

    override fun onLivingDetectListener(
        p0: ArcternImage?,
        p1: Array<out ArcternRect>?,
        p2: FloatArray?
    ) {
        TODO("Not yet implemented")
    }

    override fun onTrackListener(
        arcternImage: ArcternImage?,
        trackIds: LongArray?,
        arcternRects: Array<out ArcternRect>?
    ) {
        val drawrects: Array<FaceView.DrawRect> =
            FaceView.ArcternRectToDrawRect(arcternRects, trackIds)
        runOnUiThread {

        }
    }

    override fun onSearchListener(
        p0: ArcternImage?,
        p1: LongArray?,
        p2: Array<out ArcternRect>?,
        p3: LongArray?,
        p4: IntArray?,
        p5: FloatArray?
    ) {
        TODO("Not yet implemented")
    }

    override fun onAttributeListener(
        p0: ArcternImage?,
        p1: LongArray?,
        p2: Array<out ArcternRect>?,
        p3: Array<out Array<ArcternAttribute>>?,
        p4: IntArray?
    ) {
        TODO("Not yet implemented")
    }

}
