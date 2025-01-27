package com.example.multistreamhidescrollview.animations

import android.widget.ScrollView
import com.example.multistreamhidescrollview.Animation

class AlphaAnimation(
    rootView: ScrollView,
    topDivider: Float = 0f,
    bottomDivider: Float = 0f
) : Animation(rootView, "alpha", topDivider, bottomDivider, 1f, 0f) {

    override fun onTop(view: AnimView, relativeCoordinate: Float): Float {
        return defaultAnimValue * (relativeCoordinate / topDivider)
    }

    override fun onMiddle(view: AnimView, relativeCoordinate: Float): Float = defaultAnimValue

    override fun onBottom(view: AnimView, relativeCoordinate: Float): Float =
        defaultAnimValue * (1 - (relativeCoordinate / topDivider))
}
