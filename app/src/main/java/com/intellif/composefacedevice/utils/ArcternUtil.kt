package com.intellif.composefacedevice.utils

import com.intellif.arctern.base.ArcternRect
import com.intellif.composefacedevice.view.FaceView

object ArcternUtil {
    fun arcternRectToDrawRect(rects: Array<ArcternRect>, trackids: LongArray): Array<FaceView.DrawRect?> {
        val drawRects: Array<FaceView.DrawRect?> = arrayOfNulls(rects.size)
        for (i in rects.indices) {
            val rect = FaceView.DrawRect()
            rect.trackId = trackids[i]
            rect.x = rects[i].x
            rect.y = rects[i].y
            rect.width = rects[i].width
            rect.height = rects[i].height
            drawRects[i] = rect
        }
        return drawRects
    }
}