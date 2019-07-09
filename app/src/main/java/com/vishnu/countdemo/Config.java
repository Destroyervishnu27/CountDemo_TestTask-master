package com.vishnu.countdemo;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by Vishnu Saini On 09-07-2019.
 *
 * This class is use to store the preference value .
 * at the time of click on screen we get the touch count from shared preferences and increase the count
 * then store that count again into shared preferences .
 */
public class Config {

    /*Default values in use to store in case of value is null or empty . */
    public static final String CONFIG_FILE = "CountDemo";
    public static final String INVALID_STRING = "";
    public static final int INVALID_INT = 0;
    public static final boolean INVALID_BOOLEN = false;

    /* THis is the use to store the value in shared preferences */
    public static final String TOUCH_COUNT = "touchCount";


    /*Object of Preferences */
    private static SharedPreferences preference = null;
    private static SharedPreferences.Editor editor;
    private static Context mContext;



    /* Initialize preference when application is start */
    public static void init(Context mContext) {
        Config.mContext = mContext;
        Config.preference = mContext.getSharedPreferences(CONFIG_FILE, Context.MODE_PRIVATE);
        Config.editor = preference.edit();
    }

    /* Remove shared preferences using the particular key in not then clear all preferences*/
    public static void removeOrClearPerferance(String key) {
        if (key != null && key.trim().length() != 0)
            editor.remove(key);
        else {
            editor.clear();
        }
        editor.commit();
    }

    /* Get touch count*/
    public static int getTouchCount() {
        return preference.getInt(TOUCH_COUNT, INVALID_INT);
    }

    /* Store Touch Count*/
    public static void setTouchCount(int count) {
        editor.putInt(TOUCH_COUNT, count);
        editor.commit();
    }



}

