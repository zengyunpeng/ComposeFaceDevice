package com.intellif.composefacedevice.ui.vm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.intellif.arctern.FaceUtils
import com.intellif.arctern.base.*
import com.intellif.composefacedevice.utils.ArcternUtil
import com.intellif.composefacedevice.view.FaceView
import com.intellif.composefacedevice.view.preview.LivingListener
import java.util.*

class MainVm : ViewModel(), DetectCallBack, TrackCallBack, SearchCallBack, AttributeCallBack,
    LivingListener {
    val faceRecs = MutableLiveData<Array<FaceView.DrawRect?>>()

    override fun onDetectListener(p0: ArcternImage?, p1: Array<out ArcternRect>?, p2: FloatArray?) {

    }

    override fun onLivingDetectListener(
        p0: ArcternImage?,
        p1: Array<out ArcternRect>?,
        p2: FloatArray?
    ) {
    }

    override fun onTrackListener(
        arcternImage: ArcternImage?,
        trackIds: LongArray,
        arcternRects: Array<ArcternRect>
    ) {
        Log.i("tag", "onTrackListener arcternImage: " + arcternImage)//这个一直未空
        Log.i("tag", "onTrackListener trackIds: ${Arrays.toString(trackIds)}")
        Log.i("tag", "onTrackListener arcternRects:${Arrays.toString(arcternRects)} ")
        faceRecs.postValue(ArcternUtil.arcternRectToDrawRect(arcternRects, trackIds))
    }

    override fun onSearchListener(
        p0: ArcternImage?,
        p1: LongArray?,
        p2: Array<out ArcternRect>?,
        p3: LongArray?,
        p4: IntArray?,
        p5: FloatArray?
    ) {
//        ArcternUtil.arcternRectToDrawRect()
    }

    override fun onAttributeListener(
        p0: ArcternImage?,
        p1: LongArray?,
        p2: Array<out ArcternRect>?,
        p3: Array<out Array<ArcternAttribute>>?,
        p4: IntArray?
    ) {

    }

    override fun livingData(arcternImage: ArcternImage?) {
        arcternImage?.apply {
            FaceUtils.getInstance().arcternsdk_access_delivery(this, this)
        }

    }
}