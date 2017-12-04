package com.crook.flash.deferreddeeplinktest;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.facebook.applinks.AppLinkData;

import org.json.JSONObject;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

import bolts.AppLinks;
import io.branch.referral.Branch;
import io.branch.referral.BranchError;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "UTKARSH--->";
    private HashMap<String, Object> aaa;
    private ImageView carImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFacebookDeferredDeepLink();
        try {
            PackageInfo info = getPackageManager().getPackageInfo(
                    "com.crook.flash.deferreddeeplinktest",
                    PackageManager.GET_SIGNATURES);
            for (android.content.pm.Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.e("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException e) {

        } catch (NoSuchAlgorithmException e) {

        }
        Log.e("PAcakgee NAME--->", getApplicationContext().getPackageName());
        carImage = (ImageView) findViewById(R.id.imageView);
        // getFacebookDeferredDeepLink();
        // An intent filter in your AndroidManifest.xml has probably already filtered by path
        // to some extent.

        // Use the target URL from the App Link to locate content.
        Uri targetUrl = AppLinks.getTargetUrlFromInboundIntent(this, getIntent());
        Log.e(TAG, "target url  " + String.valueOf(targetUrl));
        if (targetUrl != null) {
            // This is activity is started by app link intent.
            Log.e("UTKARSH", "onCreate: TARGET DATA" + targetUrl.getQueryParameter("d"));
            // targetUrl is the URL shared externally. In most cases, you embed your content identifier
            // in this data.

            // If you need to access data that you are passing from the meta tag from your website or from opening app
            // you can get them from AppLinkData.
            Bundle applinkData = AppLinks.getAppLinkData(getIntent());
            Log.e("UTKARSH", "onCreate: APPLINK DATA " + String.valueOf(applinkData));
            if (applinkData != null) {
                String camp = applinkData.getString("camp");
                Log.e("UTKARSH", "onCreate:1 " + camp);

            }

            if (applinkData != null) {
                for (String key : applinkData.keySet()) {
                    Object value = applinkData.get(key);
                    Log.d("UTKARSH PRINT BUNDLE 1", String.format("%s %s (%s)", key,
                            value.toString(), value.getClass().getName()));
                }
            }

            // You can also get referrer data from AppLinkData
            Bundle referrerAppData = applinkData.getBundle("referer_app_link");
            // Apps can easily check the Extras from the App Link as well.
            Bundle extras = AppLinks.getAppLinkExtras(getIntent());
            Log.e("UTKARSH", "onCreate EXTRAS !!: " + String.valueOf(extras));
            if (extras != null) {
                for (String key : extras.keySet()) {
                    Object value = extras.get(key);
                    Log.d("UTKARSH PRINT BUNDLE 2", String.format("%s %s (%s)", key,
                            value.toString(), value.getClass().getName()));
                }
            }
            String fbAccessToken = extras.getString("fb_access_token");
        } else {
            // Not an applink, your existing code goes here.
        }
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

    @Override
    public void onStart() {
        super.onStart();

        // Branch init
        Branch.getInstance(getApplicationContext()).initSession(new Branch.BranchReferralInitListener() {
            @Override
            public void onInitFinished(JSONObject referringParams, BranchError error) {
                if (error == null) {
                    Log.e(" UTKARSH BRANCH SDK", referringParams.toString());
                } else {
                    Log.e("UTKARSH BRANCH SDK", error.getMessage());
                }
            }
        }, this.getIntent().getData(), this);
    }

    @Override
    public void onNewIntent(Intent intent) {
        this.setIntent(intent);
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
