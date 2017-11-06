package com.crook.flash.deferreddeeplinktest;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.facebook.applinks.AppLinkData;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "NORWEGIAN WOOD";
    private HashMap<String, Object> aaa;
    private ImageView carImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carImage = (ImageView) findViewById(R.id.imageView);
        // getFacebookDeferredDeepLink();
        getAllRunningPackages();
    }

    private void getAllRunningPackages() {
        String[] names = {"Email", "Contacts"};

        String[] canonicalNames = this.getPackageManager().currentToCanonicalPackageNames(names);

        //do whatever you want with canonicalNames, e.g. launch the email app,
        //     Intent email = this.getPackageManager().getLaunchIntentForPackage(canonicalNames[0]);
        for (String s : canonicalNames
                ) {
            Log.e(TAG, "getAllRunningPackages: " + String.valueOf(this.getPackageManager().getLaunchIntentForPackage(s)));
        }
        //  context.startActivity(email);


    }


    private void getFacebookDeferredDeepLink() {
        AppLinkData.fetchDeferredAppLinkData(this, new AppLinkData.CompletionHandler() {
            @Override
            public void onDeferredAppLinkDataFetched(AppLinkData appLinkData) {


                String referrerString = TrafficTrackingUtils.getAppInstallFBReferrerString(appLinkData);
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{"vineetha70@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, referrerString);
                i.putExtra(Intent.EXTRA_TEXT, getAppLinkData(appLinkData));
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(MainActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private String getAppLinkData(AppLinkData appLinkData) {
        if (appLinkData != null)
            return "TARGET URI---" + appLinkData.getTargetUri() + "REFERRER DATA--->" + appLinkData.getRefererData() + "REF DATA---> " + appLinkData.getRef();
        else {
            return "NUll VALUE";
        }
    }

    public void start(View view) {
        Animator objectAnimator = AnimatorInflater.loadAnimator(this, R.animator.shake_y);
        objectAnimator.setTarget(carImage);
        Log.e("UTAKSRH", "start: " + carImage.getWidth());
        objectAnimator.start();

    }
}
