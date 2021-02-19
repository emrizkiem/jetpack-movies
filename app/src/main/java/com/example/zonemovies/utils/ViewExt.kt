package com.example.zonemovies.utils

import android.view.View
import androidx.core.widget.NestedScrollView
import org.jetbrains.anko.sdk27.coroutines.onScrollChange

fun NestedScrollView.onScroll(
    listener: (v: View?, scrollY: Int, alpha: Float) -> Unit
) {
    onScrollChange { v, _, scrollY, _, _ ->
        listener.invoke(v, scrollY, scrollY.toFloat() / 500)
    }
}