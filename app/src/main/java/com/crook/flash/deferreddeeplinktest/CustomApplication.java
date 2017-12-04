package com.crook.flash.deferreddeeplinktest;

import android.app.Application;

import io.branch.referral.Branch;

/**
 * Created by Utkarsh Shukla on 16/10/17.
 */

public class CustomApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        CaocConfig.Builder.create()
//                .backgroundMode(CaocConfig.BACKGROUND_MODE_SILENT) //default: CaocConfig.BACKGROUND_MODE_SHOW_CUSTOM
//                .enabled(false) //default: true
//                .showErrorDetails(false) //default: true
//                .showRestartButton(false) //default: true
//                .trackActivities(true) //default: false
//                .minTimeBetweenCrashesMs(2000) //default: 3000
//                .errorDrawable(R.drawable.car) //default: bug image
//                .restartActivity(MainActivity.class) //default: null (your app's launch activity)
//                .errorActivity(CustomErrorActivity.class) //default: null (default error activity)
//                .apply();
        // Branch logging for debugging
        Branch.enableLogging();
        // Initialize the Branch object
        Branch.getAutoInstance(this);
    }
}

