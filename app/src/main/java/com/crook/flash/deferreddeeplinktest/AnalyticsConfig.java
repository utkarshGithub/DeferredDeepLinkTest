package com.crook.flash.deferreddeeplinktest;

/**
 * Created by Utkarsh Shukla on 04/10/17.
 */

/**
 * Created by somebody on 18-Aug-16.
 */
public class AnalyticsConfig {


    public final class EVENT_PROPERTIES {
        public final class KEYS {
            //anything with the prefix USER_ is data related to the user who is taking the specified action


            //related to incoming traffic tracking
            public static final String PRODUCT_DDL = "ProductDDL"; //will contain product id as value
            public static final String STORE_DDL = "StoreDDL";  //will contain store id as value
            public static final String SOURCE = "Source";   //the source from where installation happend i.e. Facebook, Google etc.
            public static final String AD = "Ad";
            public static final String REFERRER = "Referrer";
            public static final String DOWNLOAD_SOURCE = "download_source";
            public static final String CAMPAIGN_INFO = "campaign_info";
            public static final String USER_INFO = "user_info";
            public static final String INTERN = "intern";
            public static final String PHONE = "phone";
            public static final String EMAIL = "email";
            public static final String OTHERS = "others";
        }

    }
}
