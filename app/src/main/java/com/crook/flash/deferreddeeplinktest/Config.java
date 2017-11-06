package com.crook.flash.deferreddeeplinktest;

/**
 * Created by Utkarsh Shukla on 04/10/17.
 */


        import java.math.BigDecimal;

/**
 * Created by akutty on 11/12/14.
 */
public class Config {
    public static final String GALLERY_SELECTED_IMAGE_LIST = "GALLERY_SELECTED_IMAGE_LIST";
    public static final int FORGOT_PASSWORD_FLOW = 101;
    public static final int CHANGE_PASSWORD_FLOW = 102;
    public static final int CHANGE_NUMBER_FLOW = 103;
    public static final int GUEST_CHECKOUT_OTP_VERIFICATION = 104;
    public static final String DEV_D_BUILD = "dev";
    public static final String PROD_BUILD = "prod";

    public static final String SMS_RECEIVED = "android.provider.Telephony.SMS_RECEIVED";
    public static final String SMS_RECEIVER_KEY = "pdus";
    public static final String SHOP101_OTP_SENDER_NAME = "-SHPONE";
    public static final java.lang.String OTP_REGEX = "(\\s\\d{6}\\s)";
    public static final String THREE_GPP = "3gpp";
    public static final String THREE_GPP_2 = "3gpp2";
    public static final String BANK_DETAILS_DO_NOT_EXIST = "Bank account details do not exist";
    public static final String STORE_REFERRER = "store_referrer";
    public static final String SUCCESS = "success";
    public static final String CHANGED_ADDRESS = "changedAddress";
    public static final String CHANGED_PINCODE = "changedPincode";
    public static final String BUNDLE_PICKUP_ADDRESS_MODEL = "BUNDLE_PICKUP_ADDRESS_MODEL";
    public static final String PICKUP_LOCATION_ID = "pickupLocationId";
    public static final String CHANGE_STATUS = "changeOrderStatus";
    public static final String STORE_SEARCH_PINCODE = "pincode";
    public static final String VIEWS = "Views";
    public static final String FOLLOWERS = "Followers";
    public static final String BACK_SLASH = "/";
    public static final String JPEG = ".jpeg";
    public static final String FILE_SCHEME = "file://";
    public static final int MAIN_DRAWER_LIST = 299;
    public static final String PRODUCT_DETAIL_VIEW_TYPE = "reseller";
    public static final String SHOW_RESELLER_FEED_ON_LAUNCH = "show_suggested_wholesalers";
    public static final String WHOLESALE_PRODUCTS_ADDED_COUNT = "wholesale_products_added_count";
    public static final String WHOLESALE_PRODUCTS_ADDED_COUNT_LIMIT = "wholesale_products_added_count_limit";
    public static final String SHIPMENT_DISPUTES_ALLOWED_COUNT = "shipment_disputes_allowed_count";
    public static final String WHATSAPP_BROADCAST_FOLDER = "WhatsApp-broadcast";
    public static final String INSTAGRAM_SHARE_FOLDER = "Instagram-Share";
    public static final String VISIBLE = "visible";
    public static final String HIDDEN_FROM_BUYER_STATUS = "hidden";
    public static final int SAVE_PRODUCT_IMAGE = 500;
    public static final String INSTAGRAM_PACKAGE_NAME = "com.instagram.android";
    public static final int MULTI_SHARE_IMAGE_LIMIT = 20;
    public static final String RESELLER_FAQ_TIP_SHOWN = "reseller_faq_tip_shown";
    public static final String PICKUP_RATES_DIALOG_COUNT = "pickup_rates_dialog_count";
    public static final int CHOOSE_PRODUCT_GST_CATEGORY = 888;
    public static final String PRODUCST_GST_CATEGORY_BUNDLE = "gst_sub_classification";
    public static final String NEW_LINE = "\n";
    public static final String NON_GST_PRODUCTS_COUNT = "non_gst_products_count";
    public static final String IS_GST_CATEGORY_ASSIGNED = "is_gst_category_assigned";
    public static final String STOP_ONLINE_PAYMENT_WITHOUT_GST = "stop_online_payment_without_gst";
    public static final String IMAGE_THUMBNAIL_SUFFIX = "-thumbnail";
    public static final String IMAGE_THUMBNAIL_600B_SUFFIX = "-thumbnail-600b";
    public static final long REQUESTED_CATEGORY_GST_SUB_CATEGORY_ID = 4936342659L;
    public static final long REQUESTED_CATEGORY_GST_CATEGORY_ID = 5037907575L;
    public static final String LAST_CHECKED_GST_POPUP_TIMESTAMP = "last_checked_gst_popup_timestamp";
    public static final String GST_POPUP_LESS_THAN_FIVE_ORDERS_SHOWN = "gst_popup_less_than_five_orders_shown";
    public static final String BUNDLE_UPDATED_WHOLESALERS_LIST = "bundle_updated_wholesalers_list";
    public static final int SHOW_STORE_FRONT = 339;
    public static final String SELLING_STATE = "selling_state";
    public static final String GST_IC_BLOCKING_SCREEN_SHOWN = "gst_ic_blocking_screen_shown" ;
    public static final int SHOP101_CREDIT = 87;
    public static final int NEW_TAG_SHOWN_MAX_COUNT = 3;
    public static final int PLAY_WEEK_PRIZES = 357;
    public static boolean IS_RESELLER_REQUEST_SENT = false;
    public static int COMING_FROM_CUSTOMER_DETAILS = 420;
    public static int COMING_FROM_ORDER_LIST = 111;
    public static final int COMING_FROM_SHAREHEAD = 201;
    public static final String NEW_USER = "new_user";
    public static final String PAYMENT_ID = "payment_id";
    public static final String PAYMENT_RESULT = "payment_result";
    public static final int PAYMENT_STARTED = 555;
    //public static final String LAST_ALBUM_CHOSEN = "last_album_chosen"; // TODO: 24-Feb-17 figure out how we can take the user to last chosen gallery album directly with new gallery structure and then implement this
    public static final String OLD_IMAGE_FOLDER_PATH = "O1folder";
    public static final String IMAGE_FOLDER_PATH = "Shop101";
    public static final String COUPON_IMAGE_SUBFOLDER_NAME = "Coupons";
    public static final int IMAGE_UPLOAD_REQUEST_CODE = 666;
    public static final String UPLOAD_FROM_NOTIFICATION = "upload_from_notification";
    public static final int ONLY_SAVE_PRODUCT = 111;
    public static final int SAVE_AND_ADD_ANOTHER_PRODUCT = 222;
    public static final String ERROR_UPLOAD = "error_image_upload";
    public static final String STOP_UPLOAD = "stop_image_upload";
    public static final String START_UPLOAD = "start_image_upload";
    public static final int COMING_FROM_SIGN_IN = 0;
    public static final int COMING_FROM_USER_PROFILE = 1;
    public static String ARE_SHAREHEADS_ENABLED = "are_shareheads_enabled";
    public static boolean ACCESSIBILITY_INSTRUCTION_RUNNING = false;
    public static final int SHAREHEAD_FEATURE = 420;
    public static final int FLOATING_COLLAGE_SHARE = 50;
    public static final int FLOATING_PRODUCT_SHARE = 51;
    public static final String OLD_STORE_COLLAGE_IMAGE_LIST = "store_collage_list";
    public static final String STORE_COLLAGE_IMAGE_LIST = "store_collage_image_list";
    public static final int COMING_FROM_NOTIFICATION = 112;
    public static final String GCM_SENDER_ID = "685091796384";
    //public static final String GCM_SENDER_ID="1016614886927";
    public static final int PAYMENT_SUCCESS = 1;
    public static final int PAYMENT_FAILED = 2;
    public static final int PAYMENT_CANCELLED = 3;
    public static final int PAYMENT_FAILED_OTHER = 4;
    public static final String PRODUCT_TIMER = "Time Spent on Product";
    public static final String STORE_TIMER = "Time Spent on Store";
    public static final String DASHBOARD_TIMER = "Time Spent on Dashboard";
    public static final String IS_ANALYTICS_SETUP = "analytics_setup";
    public static final int LOGGED_IN = 1;
    public static final int GUEST = 2;
    public static String MIXPANEL_TOKEN = "498c4b2d3eec3080b63e2c31307e4800";       //production
    //public static final String MIXPANEL_TOKEN="2aff1b6fbc01cbf04461b51adff404a4";     //testing
    public static final boolean ENABLE_SAVE_BUTTON = true;
    public static final boolean DISABLE_SAVE_BUTTON = false;
    public static final int FROM_PRODUCT_DETAIL_ACTIVITY = 1;
    public static final int FROM_IMAGE_VIEWER_ACTIVITY = 2;
    public static final int ALBUM_GRIDVIEW = 0;
    public static final int IMAGE_GRIDVIEW = 1;
    public static final int DETAIL_ACTIVITY_IMAGE_FRAGMENT = 0;
    public static final int ZOOM_ACTIVITY_IMAGE_FRAGMENT = 1;

    public static final String COD_CHOSEN = "cod";
    public static final String ONLINE_PAYMENT_CHOSEN = "onlinepayment";
    public static final String SELF_COLLECTION_CHOSEN = "selfcollection";
    public static final String PAYTM_CHOSEN = "selfcollectionpaytm";
    public static final String DEFAULT_SHIPPING_CHARGE = "125";
    public static final String STORE_SELF_DELIVERY = "storeSelfDelivery";
    public static final String STORE_VENDOR_SHIPPING_TIEUP = "storeVendorShippingTieup";
    public static final String SHIPMENT_CHARGES_SCHEME = "shipmentScheme";
    public static final String COLOR_THEME = "theme";
    public static final String THEME_PROFILE = "theme_profile";
    public static final int REQUEST_CODE_TAKE_PICTURE = 1000;
    public static final int REQUEST_CODE_ATTACH_PICTURE = 2000;
    public static final String LOCATION_LAT = "lat";
    public static final String LOCATION_LNG = "lng";
    public static final String CUSTOMER_ID = "customerId";
    public static final String STORE_AVAILABLE = "store_available";
    public static final String BLANK = "";
    public static final String SPACE = " ";
    public static final int EXPLORE_STORES = 100;
    public static final int VIEW_STORE = 101;
    public static final int VIEW_PURCHASE_HISTORY = 102;
    public static final int STORE_SETTINGS = 103;
    public static final int STORE_SETUP = 104;
    public static final int REFER_FRIEND = 105;
    public static final int STORE_POLICY = 106;
    public static final int ENABLE_MONEY_TRANSFER = 107;
    public static final int REQUEST_OWN_DOMAIN = 108;
    public static final int VIEW_SUGGESTED_WHOLESALERS = 109;
    public static final int RETURN_RATE = 110;
    public static final int PAYMENT_OPTIONS = 200;
    public static final int THANK_YOU = 201;
    public static final int PRODUCT_INVENTORY = 202;
    public static final int SALES = 203;
    public static final int TOTAL_ORDERS = 204;
    public static final int TOTAL_CUSTOMERS = 205;
    public static final int WHOLESALERS_LAYOUT = 208;
    public static final int RESELLERS_LAYOUT = 209;
    public static final int ONLINE_PAYMENT = 206;
    public static final int SOCIAL_NETWORK_FB = 207;
    public static final int SHOW_ADDRESS = 210;
    public static final int ADD_ADDRESS = 211;
    public static final int DASHBOARD_ADD_PRODUCT = 217;
    public static final int APPGUIDE = 218;
    public static final String AUTH_TOKEN = "auth";
    public static final String STOREID = "storeId";
    public static final String STORE_BANNER = "banner";
    public static final String STORE_NAME = "storename";
    public static final String STORE_PHONE = "storephone";
    public static final String STORE_LINK = "storelink";
    public static final String STORE_CUSTOM_DOMAIN_URL = "storecustomdomainurl";
    public static final String STORE_ADDRESS = "storeaddress";
    public static final String STORE_CITY = "storecity";
    public static final String STORE_PINCODE = "storepincode";
    public static final String STORE_EMAIL = "storeEmail";
    public static final String USER_ID = "userId";
    public static final String USER_NAME = "userName";
    public static final String USER_EMAIL = "userEmail";
    public static final String USER_PHONE = "userPhone";
    public static final String USER_FAVORITES = "favorites";
    public static final String STORE_SETUP_TITLE = "Store Setup";
    public static final String SALES_SUMMARY_TITLE = "Sales Summary";
    public static final String IMAGE_TYPE_JPG = "image/jpg";
    public static final String TEXT_TYPE_PLAIN = "text/plain";
    public static final String NO_SUCH_USER = "No Such User";
    public static final String PASSWORDS_DONT_MATCH = "Passwords Dont Match";
    public static final String EMAIL_EXISTS = "Email Exists";
    public static final String PRODUCT_ADDED = "product_added";
    public static final String PRODUCT_REMOVED = "product_removed";
    public static final String PRODUCT_ID_REMOVED = "product_id_removed";
    public static final String PRODUCT_UPDATED = "product_updated";
    public static final String VARIANT = "Product Variant";
    public static final String IS_BACK_FROM_THANK_YOU_FRAGMENT = "isBackThankYouFragment";
    public static final int SALES_DAILY = 333;
    public static final int SALES_WEEKLY = 334;
    public static final int SALES_MONTHLY = 335;
    public static final int SALES_OVERVIEW = 336;
    public static final String OTP_AUTH_TOKEN = "otp_auth";
    public static final String HIDE_APPGUIDE = "hideAppGuide";
    public static final String CART_COUNT = "Cart Count";
    public static final String HIDE_SUGGESTUPGRADE = "Hide Suggest Upgrade Screen";
    public static final String SUGGESTUPGRADE = "SuggestUpgrade";
    public static final String IMAGE_CORRUPTED = "ImageCorrupted";
    public static final String ORDER_DETAIL_LEVEL_ADVANCED = "advanced";
    public static final String anonymousCartStore = "anonymousCartStore";
    public static final String userCartStore = "userCartStore";
    public static final String USER_PURCHASE_HISTORY_FRAGMENT = "UserPurchaseHistoryFragment";

    public static boolean ORDER_STATUS_UPDATED = false;
    public static boolean DASHBOARD_UPDATED = false;
    public static boolean USER_UPDATED = false;
    public static boolean STOREDETAILS_UPDATED = false;
    public static boolean STORETIP_UPDATED = false;
    public static boolean CATEGORYTIP_UPDATED = false;
    public static boolean GST_FORCE_PRODUCT_FROM_CHOOSER = false; //

    public static boolean IMAGE_CHANGES_MADE = false;
    public static String NEW_PRODUCT_COUNT = "new_product_count";
    public static String INVENTORY_PRODUCT_COUNT = "inventory_count";
    public static String TOTAL_ORDER_COUNT = "total_order_count";

    public static final String SHOW_EXHIBITION = "show_exhibition";

    public static final String VIEW_STORE_ID = "view_store_id";

    public static boolean GENERATE_STORE_COLLAGE;
    public static String PAYMENT_GATEWAY_KEY = "3HYPBB";      //prod key
    //public static String PAYMENT_GATEWAY_KEY="OzGbvJ";    //dev key

    public static String PAYMENT_URL = "https://secure.payu.in";         //prod url
    //public static String PAYMENT_URL="https://test.payu.in";       // dev url

    public static final String APP_INSTALLED = "app_installled";

    public static boolean FAVOURITE_UPDATED = false;

    public static final String WHATSAPP_PACKAGE_NAME = "com.whatsapp";

    public static String REFERRAL_SCHEME = "referral_scheme";
    public static final String IS_BACK_FROM_ORDER_CONFIRMATION = "isBackFromOrderConfirmation";

    public static String FACEBOOK_REFERRAL_TEXT = "Refer and Earn Upto Rs 5000 by referring your friends to Shop101 who sell online";

    //instagram keys
    public static String INSTAGRAM_CLIENT_ID = "3a42e2b461b44935b662dd36f4ceb5b5";
    public static String INSTAGRAM_REDIRECT_URI = "https://www.shop101.com/O1Server/instagram/authorization";
    public static String INSTAGRAM_AUTH_URL = "https://api.instagram.com/oauth/authorize/";
    public static final String INSTAGRAM_LINKED = "Instagram_Linked";
    public static final String IS_INSTA_ENABLED = "IsInstaEnabled";
    public static final String HAS_INSTA_ACCOUNT_LOGGED_IN = "hasInstaAccount"; //justnow, longback, blank
    public static final String TIME_INSTA_ACCOUNT_LOGGED_IN = "TimeInstaAccountLogin";
    public static final String IS_SHIPPER_ENABLED = "IsShipperEnabled";
    public static final String SELLER_OFFER = "SellerOffer";
    public static final String SHOW_SELLER_OFFER = "ShowSellerOffer";
    public static final String START_CATEGORY_UPLOAD = "category_image_upload";
    public static final String STOP_CATEGORY_UPLOAD = "stop_category_upload";
    public static final String ERROR_CATEGORY_UPLOAD = "category_upload_error";
    public static final String FROM_MOREFRAGMENT = "from_more_fragment";
    public static int ADD_MORE_CATEGORY = 198;
    public static int ADD_MORE_CATEGORY_AND_SAVE = 199;

    public static final String CUSTOMERS_COUNT = "store_customers_count";
    public static final String USER_CART = "cartItems";
    public static final String LOGGEDIN_USERNAME = "log_in_username";

    public static final String GET_ENABLED_FEATURES = "getFeatures";
    public static final String SHOW_SALES_OVERVIEW = "showSalesOverview";

    public static final String START_PANCARD_UPLOAD = "pancard_image_upload";
    public static final String START_PROP_UPLOAD = "proprietory_document_upload";
    public static final String PAYMENT_CYCLE_URL = "https://www.shop101.com/img/guides/payment_3x.jpg";

    public static final int PICKUP_ADDRESS_SELECTION = 153;
    public static final int PICKUP_ADDRESS_MODIFIED = 154;
    public static final int SHIP_ORDER_REQUEST_CODE = 155;
    public static final int SHIP_SUBORDER_REQUEST_CODE = 156;
    public static String isPickupTabEnabled = "is_pickup_tab_enabled";
    public static String isPaymentTabEnabled = "is_payment_tab_enabled";
    public static String isWeightDisputeTabEnabled = "is_weight_dispute_tab_enabled";

    public static final String DASHBOARD_PANEL_TIP_POSITION = "dashboard_panel_tip_position";

    public static final String STORE_COD_CHARGES = "store_cod_charges";
    public static final String STORE_SHIPPING_CHARGES = "store_shipping_charges";
    public static final String CURRENT_SHOPPING_STORE_NAME = "current_shopping_store_name";   //name of the store from which the user is currently performing a transaction on.

    public static final String INSTAGRAM_OPEN_DIRECTLY = "loadInstaDirectly";
    public static final String GET_PICKUP_ADDRESS = "get_pickup_address";

    public static String REFERRER_ID_FACEBOOK = "refer_facebook";
    public static String REFERRER_ID_WHATSAPP = "refer_whatsapp";
    public static String REFERRER_ID_EMAIL = "refer_email";
    public static String REFERRER_ID_OTHERS = "refer_others";

    // Chat constants start

    public static final String CHAT_DEV_SERVER_URI = "wss://www.zyxw365.in/O1Server/v1/chat/";
    public static final String CHAT_PROD_SERVER_URI = "wss://www.shop101.com/O1Server/chat/";

    public static final String REQUEST_OWN_DOMAIN_IMAGE_URI = "/app/android/requestOwnDomain.png";

    public static final String CHAT_PRODUCT = "chat_product";
    public static final String CHAT_BUDDY = "chat_buddy";
    public static final String CHAT_MESSAGE = "chat_message";

    public static final java.lang.String IS_PRODUCT = "is_product";
    public static final java.lang.String PRODUCT_NAME = "product_name";
    public static final java.lang.String PRODUCT_PRICE = "product_price";
    public static final java.lang.String PRODUCT_IMAGE = "product_image";

    public static final String CHAT_MESSAGE_TYPE = "chatMessageType";
    public static final String SOCKET_MESSAGE_TYPE = "messageType";
    public static final String SOCKET_MESSAGE = "message";

    public static boolean IS_CHAT_SERVICE_RUNNING = false;
    public static boolean IS_CHAT_SERVICE_IN_BG_INDIVIDUAL = false;
    public static boolean IS_CHAT_SERVICE_IN_BG_GROUP = false;
    public static boolean IS_CHAT_SERVICE_IN_BG = false;
    public static final String CHAT_LAST_SEEN_TIME = "chat_last_seen_time";

    public static final String SOCKET_CONNECTION_STATUS = "socket_connection_status";
    public static final String SOCKET_CONNECTION_OPEN = "connection-open";
    public static final String SOCKET_CONNECTION_CLOSE = "connection-close";
    public static final String SOCKET_CONNECTION_ERROR = "connection-error";
    public static final String SOCKET_MESSAGE_RECEIVED = "message-received";

    public static final String X_AUTH_TOKEN = "X-Auth-Token";
    public static final String CHAT_SOCKET_EVENT = "chat-socket-event";
    public static final String NEW_MESSAGES = "newMessages";
    public static final String IS_CHAT_ENABLED = "seller_side_chat_enabled";
    public static final String CHAT_FROM_SCREEN = "chatFromScreen";
    public static final int OPEN_CHAT_DIRECTLY = 1;
    public static final int OPEN_CHAT_FROM_LIST = 0;
    public static final String GROUP_KEY_NOTIFICATIO_PRODUCT_ADDED = "group_key_product_added";
    public static final String GROUP_NOTIFICATION_PRODUCT_UPLOAD = "group_notification_product_upload";
    public static final String SHARE_FROM_INVENTORY = "shareFromInventory";
    public static final String NEW_SHARE_PERFORMED = "newSharePerformed";
    public static final String BUYER_APP_GUIDE_HIDE = "hideBuyerAppGuide";
    public static final String SELLER_APP_GUIDE_HIDE = "hideSellerAppGuide";
    public static final String STORE_SETUP_PROGRESS = "storecompletionpercentage";
    public static final String SHOP101_SUPPORT_CONTACT = "shop101_support_contact";
    public static final String FACEBOOK_GRATIFICATION_POPUP = "facebook_gratification_popup";
    public static final String INSTAGRAM_MULTI_SHARING_TIP_SHOWN = "instagram_multi_sharing_tip_shown";
    public static final String MULTI_SHARING_TIP_SHOWN = "multi_sharing_tip_shown";
    public static final String RESELLER_FEED_MULTI_SHARING_TIP_SHOWN = "reseller_feed_multi_sharing_tip_shown";
    public static final String SHARE_TRACKING_IDS_LIST = "share_tracking_id_list";

    public static final String RESELL_PRODUCTS_RETAIL_MARGIN = "resell_products_retail_margin";
    public static final String RESELL_PRODUCTS_DISCOUNT_PERCENTAGE = "resell_products_discount_percentage";
    // chat constants end

    public static final String RESELLER_FEED_TIP_SHOWN_COUNT = "reseller_feed_tip_shown_count";
    public static final String RESELLER_FEED_TIP_BUTTON_CLICKED = "reseller_feed_tip_bbutton_clicked";

    public static final String IS_GST_REGISTERED = "is_gst_registered";

    public static final String IC_AVAILABLE_STATES_LIST = "ic_available_states_list";

    public static final String IC_SALES_LIMIT_PHASE1_DIALOG_SHOWN = "ic_sales_limit_phase1_dialog_shown";
    public static final String IC_SALES_LIMIT_PHASE2_DIALOG_SHOWN = "ic_sales_limit_phase2_dialog_shown";
    public static final String IC_SALES_LIMIT_LAST_PHASE_DIALOG_SHOWN = "ic_sales_limit_last_phase_dialog_shown";

    public static final BigDecimal IC_SALES_PHASE1_LIMIT_AMOUNT = new BigDecimal(55000);
    public static final BigDecimal IC_SALES_PHASE2_LIMIT_AMOUNT = new BigDecimal(65000);
    public static final BigDecimal IC_SALES_PHASE3_LIMIT_AMOUNT = new BigDecimal(75000);

    public static final String SHOW_HELP_BUTTON = "showHelpButton";
    public static final String HELP_NUMBER = "helpNumber";
    public static final String HELP_TEXT = "helpText";
    public static final String IS_IC_OPTED = "isIcOpted";
    public static final String IS_IC_LIMIT_REACHED = "icLimitReached";

    public static final String IC_MARGIN_PERCENTAGE = "ic_margin_Percentage";


    public class DEFERRED_DEEP_LINKING {
        public static final String INSTALL_REFERRER_CONTENT = "install_referrer_content";
        public static final String DESTINATION_STORE_ID = "destination_store_id";
        public static final String DESTINATION_PRODUCT_ID = "destination_product_id";
        public static final String DETECTED_SOURCE = "source_detected";
        public static final String DETECTED_REFERRER = "referrer_detected";
        public static final String DETECTED_ADS = "ads_detected";
        public static final String DETECTED_DOWNLOAD_SOURCE = "download_source";
        public static final String DETECTED_CAMPAIGN_INFO = "campaign_info";
        public static final String DETECTED_USER_INFO = "user_info";
        public static final String DETECTED_INTERN = "intern";
        public static final String DETECTED_PHONE = "phone";
        public static final String DETECTED_EMAIL = "email";

        public static final String STORE_ID = "sid";
        public static final String PRODUCT_ID = "pid";
        public static final String SOURCE = "s";
        public static final String REFERRRER = "r";
        public static final String ADS = "ad";
        public static final String DOWNLOAD_SOURCE = "d";
        public static final String CAMPAIGN_INFO = "c";
        public static final String USER_INFO = "u";
        public static final String INTERN = "i";
        public static final String PHONE = "p";
        public static final String EMAIL = "e";

        public static final String SHOP101_FACEBOOK_APPLINK = "applink_shop101_android"; //used to track incoming traffic via deep links and deferred deep links
    }

    public static final int SHARE_SCREEN = 111;

    public static final String IS_CALLER_ID_ENABLED = "is_caller_id_enabled";
    public static final int CALLER_ID_FEATURE = 350;

    public static final int SHARE_RECENT_ITEMS = 350;
    public static final int SHARE_STORE_ITEMS = 351;
    public static final int SHARE_PRODUCT_ITEMS = 352;
    public static final int SHARE_VIA_FACEBOOK = 360;
    public static final int SHARE_VIA_WHATSAPP = 361;
    public static final int SHARE_VIA_EMAIL = 362;
    public static final int SHARE_VIA_OTHERS = 363;
    public static final int SHARE_VIA_INSTAGRAM = 364;
    public static final String IS_FACEBOOK_LOGGEDIN = "isFacebookLoggedIn";
    public static final String IS_FACEBOOK_AUTO_REPLY_ENABLED = "isFbAutoReplyEnabled";
    public static final String SHOW_REQUEST_DOMAIN = "showRequestDomain";
    public static final String SHOW_STORE_RETURN_RATE_SCREEN = "showStoreReturnRateScreen";
    public static String FACEBOOK_REDIRECT_URI = "https://www.shop101.com/O1Server/facebook/authorization";
    public static String FACEBOOK_CLIENT_ID = "1443578122617307";
    public static boolean IS_FROM_STORE_PRODUCTS = false;
    public static boolean IS_RESELLER_REQUEST_MODIFIED = false;
    public static final String INSTAGRAM_POPUP_SHOWN = "insta_popup_already_shown";
    public static final String INSTA_PRODUCTS_UPLOADED_COUNT = "number_of_insta_product_uploaded";
    public static final String REQUEST_PICKUP_COUNT = "request_pickup_count";
    public static final String REQUEST_PICKUP = "request_pickup";

    public class GCM {
        public static final String PROPERTY_REG_ID = "registration_id";
        public static final String PROPERTY_APP_VERSION = "appVersion";
        public static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
        /**
         * Substitute you own sender ID here. This is the project number you got
         * from the API Console, as described in "Getting Started."
         */
        //public static final String SENDER_ID = "171304629964";
        public static final String PROJECT_ID = "728244012242";     //sender id?
        public static final String API_KEY = "AIzaSyCjO5MLf8I93bvOTFxIZnEJBf1ULtVy6Xo";

        public static final String NEW_GCM_DATA = "new_gcm_data";
        public static final String UPDATE_GCM_DATA = "update_gcm_data";
        public static final String GCM_REG_TOKEN = "gcm_reg_token";
        public static final String GCM_INSTANCE_ID = "gcm_instance_id";
        public static final String GCM_DATA_SENT_TO_SERVER = "gcm_data_sent_to_server";
    }

    public class PRODUCT_TABLE {
        public static final String PRODUCT_ID = "productId";
    }

    public class CART {
        public static final int INCREASE = 800;
        public static final int DECREASE = 801;
        public static final int REMOVE = 802;
    }

    public class DB {
        public static final String PRICE_COLUMN = "totalProductPricing";
    }

    public class SCREEN {
        public static final int DASHBOARD = 900;
        public static final int CART = 901;
        public static final int PRODUCTS = 902;
        public static final int WELCOME = 903;
        public static final int LOGOUT = 904;
        public static final int NOTIFICATION = 905;
        public static final int SPLASH = 906;
    }

    public class GENERIC_ERROR_MESSAGE {
        public static final String NO_BLANK_FIELD = "Field can't be left blank";
    }

    public class GUEST_CHECKOUT {
        public static final String GUEST_USER_ID = "guest_user_id";
        public static final String GUEST_USER_NAME = "guest_user_name";
        public static final String GUEST_USER_PHONE = "guest_user_phone";
        public static final String GUEST_USER_EMAIL = "guest_user_email";
        public static final String GUEST_AUTH_TOKEN = "guest_auth_token";
    }

    public class ORDER {
        public static final String PENDING_APPROVAL = "pendingapproval";
        public static final String PENDING_SHIPMENT = "pendingshipment";
        public static final String DELIVERED = "delivered";
        public static final String PENDING_DELIVERY = "pendingdelivery";
        public static final String CANCELED = "canceled";
        public static final String CANCELED_BY_BUYER = "canceledbybuyer";
        public static final String RETURNED_TO_SELLER = "returntoseller";
        public static final int PENDING_APPROVAL_INT = 0;
        public static final int PENDING_SHIPMENT_INT = 1;
        public static final int PENDING_PICKUP_INT = 2;
        public static final int PENDING_DELIVERY_INT = 3;
        public static final int DELIVERED_INT = 4;
        public static final int CANCELED_INT = 5;
        public static final int CANCELED_BY_BUYER_INT = 6;
        public static final int RETURNED_TO_SELLER_INT = 7;
        public static final String PENDING_PICKUP = "pendingpickup";
    }

    public class NOTIFICATION {

        public static final String SYSTEM_NOTIFICATION_ID = "SYSTEM_NOTIFICATION_ID";
        public static final String DESTINATION_SCREEN_ID = "DESTINATION_SCREEN_ID";
        public static final String DESTINATION_SCREEN_INFO = "DESTINATION_SCREEN_INFO";

        public static final String RESCHEDULE_PICKUP_NOTIFICATION = "RESCHEDULE_PICKUP_NOTIFICATION";
        public static final String NEW_ORDERS_NOTIFICATION = "NEW_ORDER_NOTIFICATION";
        public static final String DELAYED_ORDERS_NOTIFICATION = "DELAYED_ORDERS_NOTIFICATION";
        public static final String ORDER_CANCELLED_BY_BUYER_NOTIFICATION = "ORDER_CANCELLED_BY_BUYER_NOTIFICATION";
        public static final String SUCCESSFUL_SHIPPING_FIRST_TWO_ORDERS_NOTIFICATION = "SUCCESSFUL_SHIPPING_FIRST_TWO_ORDERS_NOTIFICATION";
        public static final String SUCCESSFUL_DELIVERY_FIRST_TWO_ORDERS_NOTIFICATION = "SUCCESSFUL_DELIVERY_FIRST_TWO_ORDERS_NOTIFICATION";

        //mixpanel notification set start
        public static final String SHAREHEAD_PROMOTION_NOTIFICATION = "201";
        public static final String INSTAGRAM_PROMOTION_NOTIFICATION = "202";
        public static final String FACEBOOK_SHARE_NOTIFICATION = "203";
        public static final String LAST_SEEN_ACTIVITY_NOTIFICATION = "204";
        public static final String FESTIVE_SEASON_NOTIFICATION = "205";
        public static final String PRODUCT_UPLOAD_NOTIFICATION = "206";
        public static final String UPDATE_APP_NOTIFICATION = "207";   //will add this to GCMListenerService as well, so that our server can send it as well.
        //mixpanel notification set end
    }

    public static class CA_ASSISTED_REGISTRATION {
        public static final long EXISTING_VAT_PRODUCT_ID = Long.valueOf("6260438831");
        public static final long NEW_VAT_PRODUCT_ID = Long.valueOf("5104264613");
    }

    public static final long GST_BUDDY_PRODUCT_ID = Long.valueOf("6527803188");

    public static class STATIC_SCREEN {
        public static final int SUPPORT = 215;
        public static String SUPPORT_URL = "https://www.shop101.com/support?app";      //currently we dont have a support url setup
        public static final int ABOUT = 216;
        public static String ABOUT_URL = "https://www.shop101.com/static/aboutUs.html";
        public static final int FAQS = 219;
        public static String FAQ_URL = "https://www.shop101.com/faq?app";
        public static final int SHIPPINGDETAILS = 220;
        public static String SHIPPING_DETAILS_URL = "https://www.shop101.com/shipping-prices?app";
        public static final int FAQS_PAYMENT_PROCESS = 221;
        public static String FAQ_PAYMENT_PROCESS_URL = "https://www.shop101.com/faq?app#paymentsprocess";
        public static final int FAQS_ORDER_PROCESS = 222;
        public static String FAQ_ORDER_PROCESS_URL = "https://www.shop101.com/support?app#orderflow";
        public static final int FAQS_STORE_SHIPPING_PARTNERS = 223;
        public static String FAQ_STORE_SHIPPING_PARTNERS_URL = "https://www.shop101.com/support?app#shippingpartners";
        public static final int FAQS_ADD_PRODUCT_PROCESS = 224;
        public static String FAQ_ADD_PRODUCT_PROCESS_URL = "https://www.shop101.com/support?app#addproducts";
        public static final int FAQS_SHAREHEAD_PROCESS = 225;
        public static String FAQ_SHAREHEAD_PROCESS_URL = "https://www.shop101.com/support?app#sharehead";
        public static final int GENERIC_PROCESS = 226;
        public static String GENERIC_PROCESS_URL = "";
        public static final int RESELLER_FAQS = 227;
        public static String RESELLER_FAQ_URL = "https://www.shop101.com/reselling-benefits?app";

        public static final int SHOP101_HELPER_ASSISTED_GST_REGISTRATION = 228;
        public static String SHOP101_HELPER_ASSISTED_GST_REGISTRATION_URL = "https://www.shop101.com/static/gst-conditions.html";
        public static final int SHOP101_GST_RESOURCES = 229;
        public static final String SHOP101_GST_RESOURCES_URL = "https://blog.shop101.com/category/goods-services-tax-act/";
        public static final String CA_ASSISTED_GST_REGISTRATION_URL = "https://www.shop101.com/gst-registration";
        public static final int CA_ASSISTED_GST_REGISTRATION = 230;
        public static final String CA_ASSISTED_GST_REGISTRATION_UPLOAD_DOCUMENTS_URL = "https://www.shop101.com/gst-registration/status";
        public static final int CA_ASSISTED_GST_REGISTRATION_UPLOAD_DOCUMENTS = 231;
        public static final int GST_COMPLIANCE_ACCEPTANCE_FLOW = 232;
        public static final String GST_COMPLIANCE_ACCEPTANCE_FLOW_URL = "https://www.shop101.com/gst-compliance-conditions.html";
        public static final int GST_COMPLIANCE_ACCEPTANCE_FLOW_WITHOUT_BUTTONS = 233;
        public static final String SHOP101_TNC_URL = "https://www.shop101.com/static/termsOfService.html";
        public static final int SHOP101_TNC = 234;
        public static final String SHOP101_PRIVACY_POLICY_URL = "https://www.shop101.com/static/privacyPolicy.html";
        public static final int SHOP101_PRIVACY_POLICY = 235;

    }

    public class CRASHLYTICS {
        public static final String PAYMENT_SSL_ERROR = "PaymentWebViewSSLError";
        public static final String SHAREHEAD_EMPTY_PACKAGE_CRASH_LOG = "sharehead_empty_package_crash_log";
        public static final String PROGRESS_DIALOG_WINDOW_LEAK = "progress_dialog_window_leak";
    }

    public class CATEGORIES {
        public final static String UNCATEGORIZED_CATEGORY = "uncategorized";
        public final static String STATUS_VISIBLE = "visible";
        public final static String STATUS_HIDDEN = "hidden";
        public final static String STATUS_DEFAULT = "default";
    }

    public class COLLAGE {
        public static final String OLD_SPECIAL_COLLAGE_IMAGE_LIST = "special_collage_url_list";
        public static final String SPECIAL_COLLAGE_IMAGE_LIST = "special_collage_image_list";
        public static final String SPECIAL_COLLAGE_STATUS_ENABLED = "enabled";
        public static final String SPECIAL_COLLAGE_STATUS_DISABLED = "disabled";

        public static final String DEFAULT_STORE_COLLAGE_SET = "default_store_collage_set";
    }

    public class BANNER {
        public final static String MOBILE_BANNER_PATH = "mobile_banner_path";
        public final static String WEB_BANNER_PATH = "web_banner_path";
        public static final String STORE_LOGO_PATH = "store_logo_path";
        public static final String SPECIAL_COLLAGE_URL_LIST = "special_collage_url_list";
        public static final String SPECIAL_COLLAGE_STATUS_ENABLED = "enabled";
        public static final String SPECIAL_COLLAGE_STATUS_DISABLED = "disabled";

        public static final String NEED_STORE_COLLAGE = "needStoreCollage";
    }

    public class PAYMENT_MODES {
        public static final String ONLINE_PAYMENT = "onlinepayment";
        public static final String CASH_ON_DELIVERY = "cod";
        public static final String SELF_COLLECTION = "selfcollection";
        public static final String PAY_TM = "paytm";
    }

    public class SHIPPING_MODES {
        public static final String SELF_SHIPMENT = "self_shipment";
        public static final String SHOP101_SHIPPING_PARTNERS = "shop101_shipping_partners";
    }

    public class DEVICE_INFO {
        public static final String APP_VERSION_CODE = "app_version_code";
        public static final String DEVICE_ID = "DEVICE_ID";
    }

    public class APP_UPDATE_OPERATIONS {
        public static final String SAVED_APP_VERSION_CODE = "saved_app_version_code";
    }

    public class SERVER_SIDE_ERROR_MESSAGES {
        public static final String STORE_HANDLE_ERROR = "The link to your store chosen by you is already taken";
    }

    public class USER_GUIDE_CONSTANTS {
        //Overlay constants
        public static final String OVERLAY_SEARCHSTORE = "overlay_search";
        public static final String OVERLAY_MANAGESTORE = "overlay_addPdt";
        public static final String OVERLAY_PDTINVENTORY = "overlay_addInventory";
        public static final String OVERLAY_PDTINVENTORY_INSTAGRAM = "overlay_instagram";
        public static final String OVERLAY_PDTINVENTORY_SEARCH = "overlay_search_Inventory";
        public static final String OVERLAY_INSTAGRAM = "overlay_instagram_operations";
        public static final String OVERLAY_CUSTOMER_MANAGEMENT = "overlay_customer_management";
        public static final String OVERLAY_CANCEL_ORDER = "overlay_cancel_order";
        public static final String OVERLAY_REQUEST_PICKUP = "overlay_request_pickup";
        public static final String OVERLAY_NON_GST_PRODUCT = "overlay_show_non-gst_products";

        //seller order payment explanation dialogs
        public static final String FIRST_TIME_ONLINE_PAYMENT_EXPLANATION_DIALOG_SEEN = "FIRST_TIME_ONLINE_PAYMENT_EXPLANATION_DIALOG_SEEN";
        public static final String FIRST_TIME_COD_EXPLANATION_DIALOG_SEEN = "FIRST_TIME_COD_EXPLANATION_DIALOG_SEEN";
        public static final String FIRST_TIME_DTS_EXPLANATION_DIALOG_SEEN = "FIRST_TIME_DTS_EXPLANATION_DIALOG_SEEN";
        public static final String FIRST_TIME_PAYTM_EXPLANATION_DIALOG_SEEN = "FIRST_TIME_PAYTM_EXPLANATION_DIALOG_SEEN";

        //in relation to above 3 shared preferences
        public static final int DEFINITELY_SEEN = 11;   //if we are 100% sure that the user has seen payment explanation dialog, this value will be used.
        public static final int MAYBE_SEEN = 10;    //if we are not sure if the user has seen the payment explanation dialog, this value will be used.
        public static final int DEFINITELY_NOT_SEEN = 0;  //by default, the user has definitely not seen the payment explanation dialog and this value will be used.
    }

    public class CUSTOMER_MANAGEMENT {
        public static final String HAVE_CONTACTS_BEEN_IMPORTED = "have_contacts_been_imported"; //once contacts have been imported from phone to app, this will be set as true
        public static final String NUMBER_OF_CUSTOMERS = "number_of_customers"; //number of users who have made a transaction from the store
        public static final String NUMBER_OF_CONTACTS = "number_of_contacts";   //number of contacts that have been imported
        public static final String HAVE_LISTS_BEEN_CREATED = "have_lists_been_created"; //if the store has contact+customer lists added to their store then this will be set to true

        public static final int ADD_MORE_ITEMS_TO_LIST_RESULT_CODE = 505;
    }

    public class INTENT_ACTIONS {
        public static final String PHONE_STATE_CHANGED = "phone_state_changed";
        public static final String CHAT_MESSAGE_RECEIVED = "chat_message_received";
        public static final String PRODUCT_IMAGE_UPLOAD_SUCCESSFUL = "PRODUCT_IMAGE_UPLOAD_SUCCESSFUL";
        public static final String DISMISS_ACCESSIBILITY_INSTRUCTION = "DISMISS_ACCESSIBILITY_INSTRUCTION";
        public static final String DRAW_OVERLAY_PERMISSION_RESULT = "DRAW_OVERLAY_PERMISSION_RESULT";
        public static final String OPEN_FROM_NOTIFICATION_ACTION = "OPEN_FROM_NOTIFICATION_ACTION";
        public static final String OPEN_URL_FROM_NOTIFICATION_ACTION = "OPEN_URL_FROM_NOTIFICATION_ACTION";
        public static final String CLEVERTAP_NOTIFICATION = "CLEVERTAP_NOTIFICATION";
    }

    public class LOCAL_BROADCASTS {
        public static final String SHAREHEAD_CONTENT_ACTIVITY_LOST_FOCUS = "sharehead_content_activity_lost_focus";
        public static final String CLOSE_SHAREHEAD_CONTENT_ACTIVITY = "close_sharehead_content_activity";
        public static final String WHATSAPP_CONVERSATION_OPENED = "whatsapp_conversation_opened";
        public static final String WHATSAPP_CONVERSATION_CLOSED = "whatsapp_conversation_closed";
        public static final String FORCE_STOP_SHAREHEAD = "FORCE_STOP_SHAREHEAD";
        public static final String SHAREHEAD_INITIAL_PRODUCT_LOAD_COMPLETE = "SHAREHEAD_INITIAL_PRODUCT_LOAD_COMPLETE";
    }

    public class DEEP_LINK_DESTINATIONS {
        public static final String PURCHASE_HISTORY = "purchase-history";
        public static final String EDIT_PROFILE = "edit-profile";
        public static final String SHOPPING_CART = "cart";
        public static final String FAQ_LINK = "faq";
        public static final String SUPPORT_LINK = "support";
        public static final String SHIPPING_LINK = "shipping-prices";
        public static final String CATEGORY_LINK = "cart";
        public static final String CLEVERTAP_PUSH_NOTIFICATION = "dl://shop101.clevertap/system_push_notification";
        public static final String CLEVERTAP_IN_APP_NOTIFICATION = "dl://shop101.clevertap/in_app_notification";
    }

    public class CHAT {
        public static final String CHAT_MESSAGE = "MESSAGE";
        public static final String CHAT_HISTORY = "HISTORY";
        public static final String CHAT_RECENT = "RECENT";
        public static final String CHAT_ERROR = "ERROR";
    }

    public static boolean IS_FLOATING_NOTIFICATION_RUNNING = false;

    public class MARSHMALLOW_PERMISSIONS {
        public static final int CAMERA_PERMISSION = 10;
        public static final int STORAGE_PERMISSION = 11;
        public static final int ACCOUNTS_PERMISSION = 12;
        public static final int CONTACTS_PERMISSION = 13;
        public static final int PHONE_STATE_PERMISSION = 14;
        public static final int RECEIVE_SMS_PERMISSION = 15;

        public static final int ENABLE_COMPLETE_SHAREHEAD_PERMISSION = 16;    //Storage + Contacts permission
    }

    public class STORE_DASHBOARD_NUMBERS {
        public static final String NUMBER_OF_OPEN_ORDERS = "NUMBER_OF_OPEN_ORDERS";
    }

    public class STORE_PREVIEW_TYPE {
        public static final String FAVORITE = "favorite";
        public static final String SUGGESTED = "suggested";
        public static final String TRENDING = "trending";
        public static final String ALL = "all";

        public static final String FAVORITE_TITLE = "Favorite stores";
        public static final String SUGGESTED_TITLE = "Suggested stores";
        public static final String TRENDING_TITLE = "Trending stores";
    }

    public static boolean DASHBOARD_NUMBERS_UPDATED = false;

    public static boolean IS_SHAREHEAD_SERVICE_RUNNING = false;

    public class SOCIAL_SHARE_TYPE {
        public static final String FACEBOOK = "facebook";
        public static final String WHATSAPP = "whatsapp";
        public static final String EMAIL = "email";
        public static final String INSTAGRAM = "instagram";
    }

    public static boolean IS_CALLER_ID_SERVICE_RUNNING = false;

    public class APP_FONT_NAME {
        public static final String REGULAR = "Roboto-Regular.ttf";
        public static final String ITALIC = "Roboto-Italic.ttf";
        public static final String BOLD = "Roboto-Bold.ttf";
    }

    public class SHARE_CONTENT_TYPE {
        public static final String IMAGE = "share_image";
        public static final String TEXT = "share_text";
        public static final String URI = "share_uri";
    }

    public class NEW_STORE_CREATION {
        public static final String STORE_CREATED_NEWLY = "newStoreCreated";
        public static final String BASIC_STORE_CREATION_COMPLETED = "basicstorecreationcompleted";
        public static final String STORE_BANK_DETAILS_UPDATED = "bankdetailsupdated";
        public static final String STORE_POLICY_UPDATED = "policyupdated";
        public static final String STORE_SETUP_COMPLETE = "storesetupcomplete";
        public static final String STORE_CONGRATS_MESSAGE = "storecongratsmessage";
    }

    public class SHARE_FRAGMENT_TYPE {
        public static final String SHARE_RECENT = "shareRecent";
        public static final String SHARE_CATEGORY = "shareCategory";
        public static final String SHARE_PRODUCTS = "shareProducts";
    }

    public class SCHEDULED_TASKS {
        //keys
        public static final String APP_INSTALL_FIRST_TIME_UPLOAD_DONE = "APP_INSTALL_FIRST_TIME_UPLOAD_DONE";
        public static final String PHONEBOOK_DATA_FIRST_TIME_UPLOAD_DONE = "PHONEBOOK_DATA_FIRST_TIME_UPLOAD_DONE";

        public static final String CAN_SEND_INSTALL_DATA = "CAN_SEND_INSTALL_DATA";

        //values
        public static final String SCHEDULED_TASKS_TAG = "SCHEDULED_TASKS_TAG";
    }

    public class MANDATORY_EXTRAS {
        public static final String MANDATORY_INTENT_EXTRA_KEY = "MANDATORY_INTENT_EXTRA_KEY";
        public static final String MANDATORY_INTENT_EXTRA_VALUE = "MANDATORY_INTENT_EXTRA_VALUE";

        public static final String MANDATORY_LAUNCHER_ACTIVITY_META_DATA_KEY = "MANDATORY_LAUNCHER_ACTIVITY_META_DATA";
        public static final String MANDATORY_LAUNCHER_ACTIVITY_META_DATA_VALUE = "MANDATORY_LAUNCHER_ACTIVITY_META_DATA_VALUE";
    }

    public class BULK_UPLOAD {
        public static final String BUNDLE_NEW_IMAGE_LIST = "BUNDLE_NEW_IMAGE_LIST";
        public static final String FAILED_IMAGE_UPLOAD_COUNT = "FAILED_IMAGE_UPLOAD_COUNT";
        public static final String PRODUCT_CREATION_TYPE = "PRODUCT_CREATION_TYPE";
    }

    public static final long CRM_FOLLOWERS_LIST_ID = -1;
    public static final long CRM_CUSTOMERS_LIST_ID = -2;

    public static final String BUNDLE_CAMERA_IMAGE = "BUNDLE_CAMERA_IMAGE";
    public static final String BUNDLE_CAMERA_IMAGE_UPLOAD_TYPE = "BUNDLE_CAMERA_IMAGE_UPLOAD_TYPE";

    public static final int CAMERA_IMAGE_UPLOAD_REQUEST_CODE = 900;

    public static final int DASHBOARD_TAKE_CAMERA_PICTURE = 121;
    public static final int DASHBOARD_CHOOSE_PICTURE_GALLERY = 122;
    public static final int DASHBOARD_GET_PICTURE_INSTAGRAM = 123;

    public static boolean LOGGED_IN_STATE_CHANGED_EXPLORE_STORE_FRAGMENT = false;

    public class WHOLESALE_STORE_SETTINGS {

        public static final String WHOLESALE_STORE_ENABLED = "WHOLESALE_STORE_ENABLED";
        public static final int FRAGMENT_WHOLESALE_STORE_SET_MARGIN_FOR_ALL = 777;
        public static final int FRAGMENT_WHOLESALE_STORE_SET_POLICY = 778;

        public static final int WHOLESALER_LIST_VIEW = 779;
        public static final int SUGGESTED_WHOLESALER_LIST_VIEW = 783;
        public static final int APPROVED_WHOLESALER_LIST_VIEW = 784;
        public static final int RESELLER_LIST_VIEW = 780;

        public static final int WHOLESALE_PRODUCT_VIEW = 781;
        public static final int RETAIL_PRODUCT_VIEW = 782;

        public static final String SHOP101_COMMISSION = "shop101_commission";
        public static final String NO_OF_NON_LINKED_WHOLESALERS = "non_linked_wholesalers_count";
        public static final String GET_FROM_WHOLESALERS_CLICKED = "get_from_wholesalers_clicked";
    }

    public class RESELLER_REQUEST_STATUS {
        public static final String APPROVED = "approved";
        public static final String PENDING = "pending";
        public static final String REJECTED = "rejected";
    }

    public static final String CONTENT_TYPE = "application/json";

    public class SHARE_DATA {
        public static final String WHATSAPP_SHARE_COUNT = "WHATSAPP_SHARE_COUNT";
    }

    public class SHAREHEAD_POSITION_DATA {
        public static final String WHATSAPP_HOME_SHAREHEAD_POSITION = "WHATSAPP_HOME_SHAREHEAD_POSITION";
        public static final String WHATSAPP_CONVERSATION_SHAREHEAD_POSITION = "WHATSAPP_CONVERSATION_SHAREHEAD_POSITION";

        public static final String WHATSAPP_HOME_SHAREHEAD_DEFAULT_POSITION = "WHATSAPP_HOME_SHAREHEAD_DEFAULT_POSITION";
        public static final String WHATSAPP_CONVERSATION_SHAREHEAD_DEFAULT_POSITION = "WHATSAPP_CONVERSATION_SHAREHEAD_DEFAULT_POSITION";
    }

    public static final String FACEBOOK_AUTH_BASE_URL = "https://www.facebook.com/v2.8/dialog/oauth";

    public class DEVICE_MANUFACTURER_NAMES {
        public static final String ONE_PLUS = "OnePlus";
    }

    public class DEVICE_MODEL_NAMES {
        public static final String ONE_PLUS_THREE = "ONEPLUS A3003";
    }

    public class WEBVIEW_COOKIES {
        public static final String SHOP101_WEBSITE_SESSION_COOKIE = "shop101Session";
        public static final String SHOP101_IS_MOBILE_APP = "shop101IsMobileApp";
    }

    public static int NUMBER_OF_NEW_PRODUCTS = 0;

    public static class STORE_DASHBOARD_TIPS {
        public static final String SPECIAL_TIP = "specialTip";
        public static final String DEFAULT_TIP = "defaultTip";
        public static final String IMPORT_CRM_CONTACTS_TIP = "IMPORT_CRM_CONTACTS_TIP";
        public static final String USER_GUIDANCE_TIP = "USER_GUIDANCE_TIP";

        public static final int USER_GUIDANCE_FIRST_STEP_ACTIVE = 200;
        public static final int USER_GUIDANCE_SECOND_STEP_ACTIVE = 201;
        public static final int USER_GUIDANCE_THIRD_STEP_ACTIVE = 202;

        public static boolean IMPORT_CRM_CONTACTS_TIP_UPDATED = false;

        public static final String CAN_SHOW_USER_GUIDANCE_TIP = "CAN_SHOW_USER_GUIDANCE_TIP";
    }

    public static class MARKETING_FEATURE_ACTIVATION {
        public static final String IS_FACEBOOK_SHARE_DECISION_TAKEN = "IS_FACEBOOK_SHARE_DECISION_TAKEN";
        public static final String IS_INSTAGRAM_SYNC_DECISION_TAKEN = "IS_INSTAGRAM_SYNC_DECISION_TAKEN";
        public static final String IS_WHATSAPP_SHAREHEAD_DECISION_TAKEN = "IS_WHATSAPP_SHAREHEAD_DECISION_TAKEN";
    }

    public static class AB_TESTING {
        public static final String BUYER_AB_TESTING_KEY = "BUYER_AB_TESTING_KEY";
        public static final String SELLER_AB_TESTING_KEY = "SELLER_AB_TESTING_KEY";

        public static final String BUYER_AB_TESTING_KEY_TIMESTAMP = "BUYER_AB_TESTING_KEY_TIMESTAMP";
        public static final String SELLER_AB_TESTING_KEY_TIMESTAMP = "SELLER_AB_TESTING_KEY_TIMESTAMP";

        public static final int UPLOAD_PRODUCTS_ACTION_CODE = 500;
        public static final int COMPLETE_STORE_PAYMENTS_AND_DELIVERY_ACTION_CODE = 501;
        public static final int MARKET_WEBSITE_ACTION_CODE = 502;
    }

    public static final String SHAREHEAD_ACTIVATION_PROMPTED = "SHAREHEAD_ACTIVATION_PROMPTED";
    public static final String SHAREHEAD_ACTIVATION_PROMPTED_LAST_ID = "SHAREHEAD_ACTIVATION_PROMPTED_LAST_ID";

    public static final String IS_DEMO_RUN_DECISION_TAKEN = "IS_DEMO_RUN_DECISION_TAKEN";
    public static boolean CAN_SHOW_PROMOTE_PRODUCTS_DIALOG = false;

    public static final String SHOP101_GALLERY_LAST_UPDATED_TIMESTAMP = "SHOP101_GALLERY_LAST_UPDATED_TIMESTAMP";
    public static final String SESSION_START_TIMESTAMP = "SESSION_START_TIMESTAMP";
    public static final String PHONE_GALLERY_HIGHEST_IMAGE_ADDED_TIMESTAMP = "PHONE_GALLERY_HIGHEST_IMAGE_ADDED_TIMESTAMP";
    public static final String PHONE_GALLERY_HIGHEST_IMAGE_MODIFIED_TIMESTAMP = "PHONE_GALLERY_HIGHEST_IMAGE_MODIFIED_TIMESTAMP";

    public static final String IS_SMS_PERMISSIONS_DIALOG_SHOWN = "IS_SMS_PERMISSIONS_DIALOG_SHOWN";

    public static final String MAX_NUMBER_PINNED_PRODUCTS = "MAX_NUMBER_PINNED_PRODUCTS";
    public static final String CURRENT_NUMBER_PINNED_PRODUCTS = "CURRENT_NUMBER_PINNED_PRODUCTS";

    public static final String BUNDLE_UPDATED_PRODUCT = "BUNDLE_UPDATED_PRODUCT";
    public static final String BUNDLE_IS_INVENTORY_UPDATED = "BUNDLE_IS_INVENTORY_UPDATED";
    public static final String BUNDLE_UPDATED_PRODUCT_PIN_STATUS = "BUNDLE_UPDATED_PRODUCT_PIN_STATUS";
    public static final String BUNDLE_UPDATED_PRODUCT_ID = "BUNDLE_UPDATED_PRODUCT_ID";

    public final class INVENTORY_TABS {
        public static final int PRODUCTS_TAB = 0;
        public static final int INSTAGRAM_DRAFTS_TAB = 1;
    }

    public static final String LAST_PRODUCT_UPLOAD_TIMESTAMP = "LAST_PRODUCT_UPLOAD_TIMESTAMP";

    public static final String LAST_FETCHED_RESELL_SHARING_TIPS_TIMESTAMP = "LAST_FETCHED_RESELL_SHARING_TIPS_TIMESTAMP";

    public static final String LAST_REQUESTED_MORE_WHOLESALERS_TIME_STAMP = "LAST_REQUESTED_MORE_WHOLESALERS_TIME_STAMP";

    public static final String LAST_FETCHED_SHOW_RATING_API_TIME_STAMP = "LAST_FETCHED_SHOW_RATING_API_TIME_STAMP";

    public static final String UPDATED_SUBORDER_ID = "UPDATED_SUBORDER_ID";
    public static final String BUNDLE_SUBORDER_MODEL = "BUNDLE_SUBORDER_MODEL";

    public static final String INSTAGRAM_LOGIN_STATUS_NEW = "justnow";
    public static final String INSTAGRAM_LOGIN_STATUS_OLD = "longback";

    public static final String payTmNumber = "payTmNumber";

    public final class SHIPPERAVAILABILITYSTATUS {
        public static final int SHOW_AVAILABILITY = 1;
        public static final int NON_COD_AVAILABILITY = 2;
        public static final int COD_MAX_EXCEEDED_UNAVAILABILITY = 3;
        public static final int COD_PIN_UNAVAILABILITY = 4;
    }

    public final class COUPON_CODE_STATUS {
        public static final String ACTIVE = "active";
        public static final String INACTIVE = "inactive";
        public static final String DELETED = "deleted";
    }

    public static final long UNLIMITED_COUPON_USAGE_COUNT = 100000;
    public static final String COUPON_UPLOADED_COUNT = "COUPON_UPLOADED_COUNT";
    public static final String COUPON_HEADER_INFO_DISMISSED = "COUPON_HEADER_INFO_DISMISSED";

    public class SHIPPING_SERVICES {
        public static final String FEDEX_ECONOMY = "FedEx Economy";
        public static final String FEDEX_OVERNIGHT = "FedEx Overnight";
        public static final String DELHIVERY_EXPRESS = "Delhivery Express";
        public static final String BLUEDART_EXPRESS = "Bluedart Express";
    }

    public static final String BUNDLE_ORDER_TRACKING_INFO_MODEL = "BUNDLE_ORDER_TRACKING_INFO_MODEL";

    public static final String REFER_AND_EARN_NEW_TAG_COUNT = "referAndEarnNewTagCount";
    public static final String SHOP101_CREDIT_NEW_TAG_COUNT = "shop101CreditNewTagCount";
    public static final String PLAY_WEEKLY_PRIZES_TAG_COUNT = "playWeeklyPrizesTagCount";

    public final class ORDER_SEARCH_TYPE_CODES {
        public static final int ORDER_ID_SEARCH_CODE = 100;
        public static final int PRODUCT_NAME_SEARCH_CODE = 101;
        public static final int BUYER_NAME_SEARCH_CODE = 102;
        public static final int BUYER_PHONE_NUMBER_SEARCH_CODE = 103;
        public static final int ORDER_DATE_SEARCH_CODE = 104;
    }

    public final class SHARE_MADE {
        public static final String WHATSAPP = "WHATSAPP";
        public static final String FACEBOOK = "FACEBOOK";
        public static final String EMAIL = "EMAIL";
        public static final String CLIPBOARD = "CLIPBOARD";
        public static final String INSTAGRAM = "INSTAGRAM";
        public static final String OTHERS = "OTHERS";
        public static final String SYSTEM_SHARE = "SYSTEM_SHARE";
        public static final String FACEBOOK_MESSENGER = "FACEBOOK_MESSENGER";
        public static final String COUPON = "COUPON";
    }

    public final class KYC_DETAILS {
        public static final String TIN_NUMBER = "TIN_NUMBER";
        public static final String VAT_CERTIFICATE = "VAT_CERTIFICATE";
        public static final String GHUMASTA_LICENSE = "GHUMASTA_LICENSE";
        public static final String UDYOG_ADHAAR = "UDYOG_ADHAAR";
    }

    public final class EMOJI_CODE {
        public static final int DOWN_POINTING_HAND = 0x1F447;
        public static final int UP_POINTING_HAND = 0x1F446;
        public static final int COLLISION = 0x1F4A5;
        public static final int WHITE_HEAVY_CHECK_MARK = 0x2705;
        public static final int BLACK_SQUARE = 0x25AA;
        public static final int LARGE_MINUS_SIGN = 0x2212;
        public static final int FULL_WIDTH_EQUALS_SIGN = 0xFF1D;
    }

    public final class SHOP101_VIDEOS {
        public static final String GST_VIDEO_LINK = "https://www.youtube.com/watch?v=auCv8ouGOO4&list=PL-C__BMB0VgJR7OIeJtJHDo8eUWSyLdDV";
    }

    public final class GST {
        public static final String GST_CERTFICATE_DOC = "gst_certificate";
        public static final String GST_SELFIE_CERTFICATE_DOC = "gst_selfie_certificate";
        public static final String PAN_CERTFICATE_DOC = "pan_certificate";
        public static final String PAN_SELFIE_CERTFICATE_DOC = "pan_selfie_certificate";

        public static final String START_GST_UPLOAD = "GST_CERTIFICATE";
        public static final String START_GST_SELFIE_UPLOAD = "GST_CERTIFICATE_SELFIE";

        public static final String START_GST_PANCARD_UPLOAD = "GST_PAN_CARD";
        public static final String START_GST_PANCARD_SELFIE_UPLOAD = "GST_PAN_CARD_SELFIE";

        public static final String START_GST_PROV_UPLOAD = "PROVISONAL_CERTIFICATE";
        public static final String START_GST_PROV_SELFIE_UPLOAD = "PROVISONAL_CERTIFICATE_SELFIE";

        public static final String VERIFICATION_STATUS_GST_ID_PENDING = "gstidpending";
        public static final String VERIFICATION_STATUS_GST_ID_ACCEPTED = "gstidaccepted";
        public static final String VERIFICATION_STATUS_GST_ID_REJECTED = "gstidrejected";
        public static final String VERIFICATION_STATUS_PROV_ID_PENDING = "provisionalidpending";
        public static final String VERIFICATION_STATUS_PROV_ID_ACCEPTED = "provisionalidaccepted";
        public static final String VERIFICATION_STATUS_PROV_ID_REJECTED = "provisionalidrejected  ";
        public static final String VERIFICATION_STATUS_INCOMPLETE_DETAILS = "incompletedetails";

        public static final String ACTIVE_STATUS_NOT_ACTIVE = "notactive";
        public static final String ACTIVE_STATUS_GST_ID_ACTIVE = "gstid";
        public static final String ACTIVE_STATUS_PROV_ID_ACTIVE = "provisionalid";
        public static final String ACTIVE_STATUS_IC_ID_ACTIVE = "icid";

        public static final String GST_DEFAULT_CATEGORY = "GST Classification Requested";

        public static final String GST_SHOW_BULK_APPLICATION_POPUP = "gst_show_bulk_application_popup";

        public static final String GST_ID_CHOSEN = "gstid";
        public static final String PROV_ID_CHOSEN = "provisionalid";
        public static final String ARN_ID_CHOSEN = "arn";
        public static final String TRN_ID_CHOSEN = "trn";
    }

    public final class GST_REGISTRATION_ACTIVE_STATUS {
        public static final String NOT_ACTIVE = "notactive";
        public static final String GST_ID = "gstid";
        public static final String PROVISIONAL_ID = "provisionalid";
        public static final String IC_ID = "icid";
    }

    public static class GST_REGISTRATION_VERIFICATION_STATUS {
        public static final String GST_ID_PENDING = "gstidpending";
        public static final String GST_ID_ACCEPTED = "gstidaccepted";
        public static final String GST_ID_REJECTED = "gstidrejected";
        public static final String PROVISIONAL_ID_PENDING = "provisionalidpending";
        public static final String PROVISIONAL_ID_ACCEPTED = "provisionalidaccepted";
        public static final String PROVISIONAL_ID_REJECTED = "provisionalidrejected";
        public static final String INCOMPLETE_DETAILS = "incompletedetails";
        public static final String ARN_SUBMITTED = "arnsubmitted";
        public static final String TRN_SUBMITTED = "trnsubmitted";
        public static final String TEMP_GST_NON_COMPLIANT = "tempgstnoncompliant";
        public static final String GST_NON_COMPLIANT = "gstnoncompliant";
        public static final String GET_MY_OWN_GST = "getmyowngst";
    }

    public static class GST_CA_REGISTRATION_VERIFICATION_STATUS {
        public static final String GST_CA_REGISTRATION_OPTED = "opted";
        public static final String GST_CA_REGISTRATION_NOT_OPTED = "notopted";
        public static final String GST_CA_REGISTRATION_INCOMPLETE_DOCS = "incompletedocuments";
        public static final String GST_CA_REGISTRATION_PENDING_APPROVAL = "pendingapproval";
        public static final String GST_CA_REGISTRATION_APPROVED = "approved";
    }

    public static class GST_TAX_FILING_STATUS_OPTION {
        public static final String GST_CA_TAX_FILING_OPTED = "opted";
        public static final String GST_CA_TAX_FILING_NOT_OPTED = "notopted";
        public static final String GST_CA_TAX_FILING_DISCONTINUED = "discontinued";
    }

    public static final String GST_PHASE1_DATE = "gst_phase1_date";
    public static final String GST_PHASE2_DATE = "gst_phase2_date";
    public static final String GST_PHASE3_DATE = "gst_phase3_date";
    public static final String GST_VERIFICATION_STATUS = "gst_verification_status";
    public static final String GST_CA_VERIFICATION_STATUS = "gst_ca_verification_status";
    public static final String GST_TAX_FILING_STATUS = "gst_tax_filing_status";

    public static final String GST_OPT_FOR_CA_COMPLIANCE_SHOWN = "gst_opt_for_gst_compliance_shown";

    public static final String LAST_GST_REGISTRATION_STATUS = "last_gst_registration_status";
}

