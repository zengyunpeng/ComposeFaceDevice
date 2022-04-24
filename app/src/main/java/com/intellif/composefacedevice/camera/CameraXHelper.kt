package com.intellif.composefacedevice.camera


import android.app.Activity
import android.content.Context
import android.util.Size
import android.view.Surface.ROTATION_0
import androidx.camera.core.AspectRatio
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import java.util.concurrent.Executors


class CameraXHelper(
    var context: Context,
    var lifecycleOwner: LifecycleOwner,
    var previewView: PreviewView,
    var analyzer: ImageAnalysis.Analyzer
) {

    init {
        //1.创建相机提供者
        val cameraProviderFuture = ProcessCameraProvider.getInstance(context)
        //2.添加监听,添加后会马上执行
        cameraProviderFuture.addListener({
            // 2.1. Used to bind the lifecycle of cameras to the lifecycle owner
            val cameraProvider: ProcessCameraProvider = cameraProviderFuture.get()

            // 2.2 设置预览相关参数
            val preview = Preview.Builder()
                .setTargetRotation(ROTATION_0)
                .setTargetResolution(Size(800, 1280))
//                .setTargetRotation((context as Activity).getWindowManager().getDefaultDisplay().getRotation())
//                .setTargetAspectRatio(AspectRatio.RATIO_4_3)
                .build()
                .also {
                    it.setSurfaceProvider(previewView.surfaceProvider)
                }

            val imageAnalysis = ImageAnalysis.Builder()
                .setOutputImageRotationEnabled(true)// 是否旋转分析器中得到的图片
                .setBackpressureStrategy(STRATEGY_KEEP_ONLY_LATEST)//只读取最新的图片
                .setTargetRotation(ROTATION_0)
                .setTargetResolution(Size(800, 1280))
                .build().apply {
                    setAnalyzer(
                        Executors.newSingleThreadExecutor(),
                    ) {
                        analyzer.analyze(it)
                        it.close()//调用 image.close() 关闭图片引用,以避免阻塞后续图像的生成（导致预览停顿）并避免可能出现的图像丢失。此方法必须完成分析或创建副本，而不是将图像引用传递到分析方法以外
                    }
                }


            // 2.3 选中摄像头
            val cameraSelector = CameraSelector.DEFAULT_FRONT_CAMERA
            try {
                // 2.4 Unbind use cases before rebinding
                cameraProvider.unbindAll()
                //2.5 Bind use cases to camera
                cameraProvider.bindToLifecycle(
                    lifecycleOwner, cameraSelector, preview, imageAnalysis//绑定多个case同时可以云岚和数据分析
                )
            } catch (exc: Exception) {
                exc.printStackTrace()
            }

        }, ContextCompat.getMainExecutor(context))
    }


}