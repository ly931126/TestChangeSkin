package com.mktech.test.testchangeskin;

import android.app.Application;

import com.zhy.changeskin.SkinManager;


/**
 * Created by liye on 2017/3/18.
 */

/**
 * 初始化皮肤
 */
public class MyApplication  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SkinManager.getInstance().init(this);
    }
}
