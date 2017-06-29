package com.gin.kotlin4android.custom

import android.content.Context

/**
 * Created by wang.lichen on 2017/6/29.
 *
 * 部分静态方法
 * 方法用 companion object { } 包裹
 */
class Utils2 {
    fun notStaticMethod() {
        Utils.log("not static method")
    }

    companion object {
        fun dp2dx(context: Context, dpValue: Float): Int {
            val scale = context.resources.displayMetrics.density
            return ((dpValue * scale + 0.5f).toInt())
        }


        fun dx2dp(context: Context, pxValue: Float): Int {
            val scale = context.resources.displayMetrics.density
            return ((pxValue / scale + 0.5f).toInt())
        }
    }
}