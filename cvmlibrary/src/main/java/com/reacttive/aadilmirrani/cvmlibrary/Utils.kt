package com.reacttive.aadilmirrani.cvmlibrary

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.core.content.ContextCompat

class Utils {
    companion object {
        fun getColorWrapper(context: Context, id: Int) : Int {
            return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                context.getColor(id)
            } else {
                ContextCompat.getColor(context, id)
            }
        }
    }

    fun getDrawable(context: Context, id: Int) : Drawable? {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            context.getDrawable(id)
        } else {
            ContextCompat.getDrawable(context, id)
        }

    }
}