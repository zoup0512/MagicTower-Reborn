package com.zoup.android.magictower;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

import org.litepal.LitePal;

/**
 * Created by zoup on 2018/11/13
 * E-Mail：2479008771@qq.com
 */
public class GameApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(this, "16a9ca43b7", true);
        LitePal.initialize(this);
    }
}
