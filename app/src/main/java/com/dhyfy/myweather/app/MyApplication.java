package com.dhyfy.myweather.app;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {
    private  static  final String TAG="MyWeather";



    private  static  Application mApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG,"MyApplication->OnCreate");
        mApplication=this;
    }
    public static Application getInstance() {
        return mApplication;
    }
    
}
