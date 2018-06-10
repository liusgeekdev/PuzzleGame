package com.lius.puzzlegame.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/**
 * @author: Chris Liu
 * @date: 2018/6/9  17:18
 */
public class ScreenUtil {
    /**
     * 获取屏幕相关参数
     * @param context context
     * @return DisplayMetrics 屏幕宽高
     */
    public static DisplayMetrics getScreenSize(Context context) {
        DisplayMetrics metrics = new DisplayMetrics();
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        display.getMetrics(metrics);
        return metrics;
    }

    /**
     * 获取屏幕density
     *
     * @param context context
     * @return density 屏幕density
     */
    public static float getDeviceDensity(Context context) {
        DisplayMetrics metrics = new DisplayMetrics();
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        wm.getDefaultDisplay().getMetrics(metrics);
        return metrics.density;
    }
}
