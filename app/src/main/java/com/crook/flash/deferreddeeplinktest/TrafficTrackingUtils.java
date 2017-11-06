package com.crook.flash.deferreddeeplinktest;

import android.util.Log;

import com.facebook.applinks.AppLinkData;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Utkarsh Shukla on 04/10/17.
 */

public class TrafficTrackingUtils
{
    private static final String TAG = "TrafficTrackingUtils";

    public static String getAppInstallFBReferrerString(AppLinkData appLinkData)
    {
        String referrerString = Config.BLANK;

        if(appLinkData != null)
        {
            String targetUrl = appLinkData.getTargetUri() != null ? appLinkData.getTargetUri().toString() : Config.BLANK;
            if(!targetUrl.isEmpty())
            {
                //remove app link tracking chunk and return rest of the string
                String[] targetUrlComponentsArray = targetUrl.split("://"); //target url will be of the form -> al_shop101_android://xyz, we need the xyz part
                if(targetUrlComponentsArray.length > 1)
                {
                    String referrerComponent = targetUrlComponentsArray[1];
                    if(referrerComponent != null && !referrerComponent.isEmpty())
                    {
                        //referrerComponent will be of the form www.shop101.com/fbDeepLink?analyticsData=d-123, need to extract the d-123 part
                        int analyticsDataQueryParametersStartPosition = referrerComponent.lastIndexOf("=");
                        referrerString = referrerComponent.substring(analyticsDataQueryParametersStartPosition + 1);
                    }
                }
            }
        }

        if(!referrerString.isEmpty() && BuildConfig.DEBUG)
        {
            Log.i(TAG,"Referrer string: " + referrerString);
        }
        return referrerString;
    }

    public static HashMap<String,Object> getReferrerTrackingPropertiesMap(String referrerString)
    {
        HashMap<String,Object> returnMap = new HashMap<>();

        if (referrerString != null && !referrerString.equalsIgnoreCase(Config.BLANK))
        {
            if (referrerString.contains("_") || referrerString.contains("-"))
            {
                Map<String, String> referrerPropertiesMap = new HashMap<String, String>();
                if (referrerString.contains("_"))
                {
                    String[] referrerComponentsArray = referrerString.split("_");
                    for(String s : referrerComponentsArray)
                    {
                        if(s.contains("-"))
                        {
                            String temp[] = s.split("-");
                            referrerPropertiesMap.put(temp[0], temp[1]);
                        }
                    }
                }
                else
                {
                    String[] referrerComponentsArray = referrerString.split("-");
                    referrerPropertiesMap.put(referrerComponentsArray[0], referrerComponentsArray[1]);
                }
                for (String s : referrerPropertiesMap.keySet())
                {
                    switch (s) {
                        case Config.DEFERRED_DEEP_LINKING.DOWNLOAD_SOURCE:
                            returnMap.put(AnalyticsConfig.EVENT_PROPERTIES.KEYS.DOWNLOAD_SOURCE,referrerPropertiesMap.get(s));
                            break;
                        case Config.DEFERRED_DEEP_LINKING.CAMPAIGN_INFO:
                            returnMap.put(AnalyticsConfig.EVENT_PROPERTIES.KEYS.CAMPAIGN_INFO,referrerPropertiesMap.get(s));
                            break;
                        case Config.DEFERRED_DEEP_LINKING.USER_INFO:
                            returnMap.put(AnalyticsConfig.EVENT_PROPERTIES.KEYS.USER_INFO,referrerPropertiesMap.get(s));
                            break;
                        case Config.DEFERRED_DEEP_LINKING.STORE_ID:
                            String referredStoreIdString = referrerPropertiesMap.get(s);
                            if (!referredStoreIdString.equalsIgnoreCase(Config.BLANK) && !referredStoreIdString.equalsIgnoreCase("0"))
                            {
                                returnMap.put(AnalyticsConfig.EVENT_PROPERTIES.KEYS.STORE_DDL,Long.valueOf(referredStoreIdString));
                            }
                            break;
                        case Config.DEFERRED_DEEP_LINKING.PRODUCT_ID:
                            String referredProductIdString = referrerPropertiesMap.get(s);
                            if (!referredProductIdString.equalsIgnoreCase(Config.BLANK) && !referredProductIdString.equalsIgnoreCase("0"))
                            {
                                returnMap.put(AnalyticsConfig.EVENT_PROPERTIES.KEYS.PRODUCT_DDL,Long.valueOf(referredProductIdString));
                            }
                            break;
                        case Config.DEFERRED_DEEP_LINKING.SOURCE:
                            //send to clevertap
                            returnMap.put(AnalyticsConfig.EVENT_PROPERTIES.KEYS.SOURCE,referrerPropertiesMap.get(s));
                            break;

                        case Config.DEFERRED_DEEP_LINKING.REFERRRER:
                            returnMap.put(AnalyticsConfig.EVENT_PROPERTIES.KEYS.REFERRER,referrerPropertiesMap.get(s));
                            break;

                        case Config.DEFERRED_DEEP_LINKING.ADS:
                            //send to clevertap
                            returnMap.put(AnalyticsConfig.EVENT_PROPERTIES.KEYS.AD,referrerPropertiesMap.get(s));
                            break;

                        case Config.DEFERRED_DEEP_LINKING.INTERN:
                            //send to clevertap
                            returnMap.put(AnalyticsConfig.EVENT_PROPERTIES.KEYS.INTERN,referrerPropertiesMap.get(s));
                            break;
                        case Config.DEFERRED_DEEP_LINKING.PHONE:
                            //send to clevertap
                            returnMap.put(AnalyticsConfig.EVENT_PROPERTIES.KEYS.PHONE,referrerPropertiesMap.get(s));
                            break;
                        case Config.DEFERRED_DEEP_LINKING.EMAIL:
                            //send to clevertap
                            returnMap.put(AnalyticsConfig.EVENT_PROPERTIES.KEYS.EMAIL,referrerPropertiesMap.get(s));
                            break;
                    }
                }
            }
        }

        if(returnMap.isEmpty())
        {
            returnMap.put(AnalyticsConfig.EVENT_PROPERTIES.KEYS.OTHERS,referrerString);
        }

        return returnMap;
    }
}

