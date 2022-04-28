package com.intellif.composefacedevice.view

import android.content.Context
import android.hardware.Camera
import android.util.AttributeSet
import android.view.SurfaceHolder
import android.view.SurfaceView

class LivingSurfaceView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : SurfaceView(context, attrs, defStyleAttr), SurfaceHolder.Callback {
    val RGB_CAMERAID = 0
    var camera: Camera? = null


    override fun surfaceCreated(holder: SurfaceHolder) {
        openCamera(holder)
    }


    override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {
        startPreview(holder, width, height)
    }


    override fun surfaceDestroyed(holder: SurfaceHolder) {
        TODO("Not yet implemented")
    }

    private fun openCamera(holder: SurfaceHolder) {
        camera = Camera.open(RGB_CAMERAID)
        try {
            camera?.setPreviewDisplay(holder)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun startPreview(surfaceHolder: SurfaceHolder, width: Int, height: Int) {
        if (surfaceHolder.surface == null) {
            return
        }
        try {
            camera?.stopPreview()
        } catch (e: Exception) {
            e.printStackTrace()
        }


    }

}