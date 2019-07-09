package com.vishnu.countdemo;

import android.app.Application;


/**
 * Created by Vishnu Saini On 09-07-2019.
 *
 * Application class initialize first when application is start
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        /* Initialize shared preferences at the time when application start*/
        Config.init(this);
    }
}
