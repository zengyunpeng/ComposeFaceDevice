package com.intellif.composefacedevice

import android.os.Bundle
import android.view.SurfaceView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.lifecycle.MutableLiveData
import com.intellif.composefacedevice.ui.theme.ComposeFaceDeviceTheme
import kotlin.reflect.KProperty

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
            content()
        }
    }


}


@Preview
@Composable
fun content() {
    Box {
        AndroidView(
            { context ->
                SurfaceView(context)
            },
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            /*ip和库内人数*/
            Column {
                Row {
                    Image(
                        painter = painterResource(R.mipmap.net_unconnect),
                        contentDescription = ""

                    )
                }

            }

            /*日期和时间*/
            Column {

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