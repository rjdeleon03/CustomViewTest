package com.rjdeleon.customviewtest

import android.content.Context
import android.view.LayoutInflater
import android.view.View

class CustomView(context: Context?) : View(context) {

    init {
        val inflater = LayoutInflater.from(context)
        inflater.inflate(R.layout.custom_search_layout, null, false)
    }

}