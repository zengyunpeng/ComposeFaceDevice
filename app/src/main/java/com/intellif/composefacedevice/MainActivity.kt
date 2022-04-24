package com.intellif.composefacedevice

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.SurfaceView
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
import com.intellif.composefacedevice.camera.CameraXHelper

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            ComposeFaceDeviceTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Greeting("Android")
//                }
//            }
            Content()
        }
    }


}


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
                            val get = it.image?.planes?.get(0)
                            val imageInfo = it.imageInfo
                            Log.i("tag", "图片宽高: " + width + " * " + height)
                            Log.i("tag", "图片信息: " + imageInfo)
                            Log.i("tag", "图片格式: " + it.format)//打印35 ImageFormat.YUV_420_888
                        }
                    }
            },
            modifier = Modifier
//                .width(640.dp)
//                .height(480.dp)
                .fillMaxHeight()
                .fillMaxWidth()
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


}

//
//@Preview
//@Composable
//fun content() {
//    MaterialTheme {
//        val state = remember { mutableStateOf(0) }
//        val typography = MaterialTheme.typography
//        Column(
////        modifier = Modifier.padding(16.dp)
//        ) {
//            Image(
//                painter = painterResource(R.mipmap.bg_blue),
//                contentDescription = null,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(180.dp)
//                    .clip(shape = RoundedCornerShape(30.dp)),
//                contentScale = ContentScale.Fit,
//            )
//            Text(
//                "6666",
//                style = typography.h6
//            )
//            Text("7777")
//            Text("8888")
//        }
//    }
//}
//
//@Preview
//@Composable
//fun myContent() {
//    Box {
//        AndroidView(
//            factory = { context ->
//                SurfaceView(context)
//            },
//            modifier = Modifier.fillMaxWidth().fillMaxHeight()
//        )
//        Text(
//            text = "Hello kkk!",
//            color = Color.White,
//            fontSize = 40.sp,
//        )
//    }
//
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ComposeFaceDeviceTheme {
////        Greeting("Android")
//        ConstraintLayout {
//            val (button, text) = createRefs()
//            Text(
//                "AAA"
//            )
//            Button(
//                onClick = {},
//                modifier = Modifier.constrainAs(button) {
//
//                }
//            ) {
//                Text("button")
//                Text("button222")
//            }
//
//            BoxWithConstraints {
//
//            }
//
//        }
//        val m = MutableLiveData(0)
//
//    }
//}
//
//class Delegate {
//    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
//        return "$thisRef, 这里委托${property.name}属性"
//    }
//
//    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
//        println("$thisRef 的属性 ${property.name} 属性赋值为 ${value}")
//
//    }
//}