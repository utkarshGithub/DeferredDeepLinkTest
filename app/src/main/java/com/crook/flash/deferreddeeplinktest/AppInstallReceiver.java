package com.crook.flash.deferreddeeplinktest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * This receiver will be used to take the user to a particular store when the app is downloaded and run the first time.
 */
public class AppInstallReceiver extends BroadcastReceiver {
    public AppInstallReceiver() {

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        try {

            String referrer = intent.getStringExtra("referrer");
            Log.e("UTKARSH--->", "InstallReceiver"+referrer);
            //format to be followed will be "shop101.com/app&referrer=key1-value_key2-value_key3-value"
            //eg. &referrer=s-1
            //eg. &referrer=sid-78483929
            //eg. &referrer=pid-849302949
            //eg. &referrer=ref-7259770091
            //eg. &referrer=ad-marketplacead
            setDataFromReferrerString(context, referrer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void setDataFromReferrerString(Context context, String referrerString) {
        try {
            if (referrerString != null && !referrerString.equalsIgnoreCase(Config.BLANK)) {
                Log.e("UTKARSH", "setDataFromReferrerString: "+referrerString );
//                SharedPreferencesManager.get(context).setString(Config.DEFERRED_DEEP_LINKING.INSTALL_REFERRER_CONTENT, referrerString);
//                if (referrerString.contains("_") || referrerString.contains("-")) {
//                    Map<String, String> map = new HashMap<String, String>();
//                    if (referrerString.contains("_")) {
//                        String[] referrerArrayTemp = referrerString.split("_");
//                        for(String s : referrerArrayTemp){
//                            if(s.contains("-")) {
//                                String temp[] = s.split("-");
//                                map.put(temp[0], temp[1]);
//                            }
//                        }
//                    } else {
//                        String[] referrerArray = referrerString.split("-");
//                        map.put(referrerArray[0], referrerArray[1]);
//                    }
//                    for (String s : map.keySet()) {
//                        switch (s) {
//                            case Config.DEFERRED_DEEP_LINKING.DOWNLOAD_SOURCE:
//                                SharedPreferencesManager.get(context).setString(Config.DEFERRED_DEEP_LINKING.DETECTED_DOWNLOAD_SOURCE, map.get(s));
//                                break;
//                            case Config.DEFERRED_DEEP_LINKING.CAMPAIGN_INFO:
//                                SharedPreferencesManager.get(context).setString(Config.DEFERRED_DEEP_LINKING.DETECTED_CAMPAIGN_INFO, map.get(s));
//                                break;
//                            case Config.DEFERRED_DEEP_LINKING.USER_INFO:
//                                SharedPreferencesManager.get(context).setString(Config.DEFERRED_DEEP_LINKING.DETECTED_USER_INFO, map.get(s));
//                                break;
//                            case Config.DEFERRED_DEEP_LINKING.STORE_ID:
//                                String referredStoreIdString = map.get(s);
//                                if (!referredStoreIdString.equalsIgnoreCase(Config.BLANK) && !referredStoreIdString.equalsIgnoreCase("0")) {
//                                    SharedPreferencesManager.get(context).setLong(Config.DEFERRED_DEEP_LINKING.DESTINATION_STORE_ID, Long.valueOf(referredStoreIdString));
//                                }
//                                break;
//                            case Config.DEFERRED_DEEP_LINKING.PRODUCT_ID:
//                                String referredProductIdString = map.get(s);
//                                if (!referredProductIdString.equalsIgnoreCase(Config.BLANK) && !referredProductIdString.equalsIgnoreCase("0")) {
//                                    SharedPreferencesManager.get(context).setLong(Config.DEFERRED_DEEP_LINKING.DESTINATION_PRODUCT_ID, Long.valueOf(referredProductIdString));
//                                }
//                                break;
//                            case Config.DEFERRED_DEEP_LINKING.SOURCE:
//                                //send to clevertap
//                                SharedPreferencesManager.get(context).setString(Config.DEFERRED_DEEP_LINKING.DETECTED_SOURCE, map.get(s));
//                                break;
//
//                            case Config.DEFERRED_DEEP_LINKING.REFERRRER:
//                                SharedPreferencesManager.get(context).setString(Config.DEFERRED_DEEP_LINKING.DETECTED_REFERRER, map.get(s));
//                                break;
//
//                            case Config.DEFERRED_DEEP_LINKING.ADS:
//                                //send to clevertap
//                                SharedPreferencesManager.get(context).setString(Config.DEFERRED_DEEP_LINKING.DETECTED_ADS, map.get(s));
//                                break;
//
//                            case Config.DEFERRED_DEEP_LINKING.INTERN:
//                                //send to clevertap
//                                SharedPreferencesManager.get(context).setString(Config.DEFERRED_DEEP_LINKING.DETECTED_INTERN, map.get(s));
//                                break;
//                            case Config.DEFERRED_DEEP_LINKING.PHONE:
//                                //send to clevertap
//                                SharedPreferencesManager.get(context).setString(Config.DEFERRED_DEEP_LINKING.DETECTED_PHONE, map.get(s));
//                                break;
//                            case Config.DEFERRED_DEEP_LINKING.EMAIL:
//                                //send to clevertap
//                                SharedPreferencesManager.get(context).setString(Config.DEFERRED_DEEP_LINKING.DETECTED_EMAIL, map.get(s));
//                                break;
//                            case Config.DEFERRED_DEEP_LINKING.SCREEN:
//                                SharedPreferencesManager.get(context).setString(Config.DEFERRED_DEEP_LINKING.DETECTED_SCREEN, map.get(s));
//                                break;
//                            default:
//                                //TODO
//                                break;
//                        }
//                    }
//                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
