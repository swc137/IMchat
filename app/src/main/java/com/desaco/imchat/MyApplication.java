package com.desaco.imchat;

import android.app.Application;
import android.content.Context;

/**
 * @author liyachao 296777513
 * @version 1.0
 * @date 2017/3/1
 * com.desaco.imchat.MyApplication
 */
public class MyApplication extends Application {


    static Context sAppContext = null;

    public static Context getContext() {
        return sAppContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sAppContext = this;
    }


}
