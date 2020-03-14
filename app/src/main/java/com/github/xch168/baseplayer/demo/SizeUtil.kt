package com.github.xch168.baseplayer.demo

import android.content.Context
import android.util.TypedValue

/**
 * Created by XuCanHui on 2018/9/23.
 */
object SizeUtil {
    fun dp2px(context: Context, dpValue: Float): Int {
        //float density = context.getResources().getDisplayMetrics().density;
        //return (int) (dpValue * density + 0.5f);
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpValue, context.resources.displayMetrics).toInt()
    }

    fun sp2px(context: Context, spValue: Float): Int {
        //float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        //return (int) (spValue * fontScale + 0.5f);
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, spValue, context.resources.displayMetrics).toInt()
    }

    fun px2dp(context: Context, pxValue: Float): Int {
        val density = context.resources.displayMetrics.density
        return (pxValue / density + 0.5f).toInt()
    }

    fun px2sp(context: Context, pxValue: Float): Int {
        val fontScale = context.resources.displayMetrics.scaledDensity
        return (pxValue / fontScale + 0.5f).toInt()
    }
}