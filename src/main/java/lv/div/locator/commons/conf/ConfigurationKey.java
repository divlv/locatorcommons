package lv.div.locator.commons.conf;

/**
 * Configuration keys for application settings
 */
public enum ConfigurationKey {

    /**
     * Configuration keys for device states
     */
    IN_SAFE_ZONE("IN_SAFE_ZONE"),
    OUT_OF_SAFE_ZONE("OUT_OF_SAFE_ZONE"),
    OUT_OF_SAFE_ZONE_TIMES("OUT_OF_SAFE_ZONE_POINTS"),
    MAP_REPORTED("MAP_REPORTED"),
    MLS_REPORTED("MLS_REPORTED"),
    LAST_REPORTED_GPS_POINT("LAST_REPORTED_GPS_POINT"),
    DEVICE_SIGNAL("DEVICE_SIGNAL"), //Latest signal, received from device


    /**
     * Common values for all devices
     */
    DISPLAY_LAST_POINTS("DISPLAY_LAST_POINTS"),
    LEAVE_SAFE_ZONE_POINTS("LEAVE_SAFE_ZONE_POINTS"),
    ENTER_SAFE_ZONE_POINTS("ENTER_SAFE_ZONE_POINTS"),
    LEAVE_SAFE_ZONE_MESSAGE("LEAVE_SAFE_ZONE_MESSAGE"),
    ENTER_SAFE_ZONE_MESSAGE("ENTER_SAFE_ZONE_MESSAGE"),
    SEND_ALERT_ADDRESS("SEND_ALERT_ADDRESS"),
    ADMIN_ALERT_ADDRESS("ADMIN_ALERT_ADDRESS"),
    MLS_REPORT_SAFE_ZONE_EACH_SEC("MLS_REPORT_SAFE_ZONE_EACH_SEC"),
    MLS_REPORT_OUT_OF_SAFE_ZONE_EACH_SEC("MLS_REPORT_OUT_OF_SAFE_ZONE_EACH_SEC"),

    /**
     * Device specific settings
     */
    SAFE_ZONE_WIFI("SAFE_ZONE_WIFI"),
    DEVICE_ALIAS("DEVICE_ALIAS"),
    SEND_ALERT_ADDRESS_PARAM1("SEND_ALERT_ADDRESS_PARAM1"),
    SEND_ALERT_ADDRESS_PARAM2("SEND_ALERT_ADDRESS_PARAM2"),
    SEND_ALERT_ADDRESS_PARAM3("SEND_ALERT_ADDRESS_PARAM3"),
    DEVICE_ADMIN_ALERT_ENABLED("DEVICE_ADMIN_ALERT_ENABLED"),
    DEVICE_SMS_ALERT_PHONE("DEVICE_SMS_ALERT_PHONE"),
    DEVICE_SMS_ALERT_ENABLED("DEVICE_SMS_ALERT_ENABLED"),
    DEVICE_APP_SHUTDOWN_ENABLED("DEVICE_APP_SHUTDOWN_ENABLED"),
    DEVICE_APP_SHUTDOWN_TIME("DEVICE_APP_SHUTDOWN_TIME"),
    DEVICE_RELOAD_CONFIG_ENABLED("DEVICE_RELOAD_CONFIG_ENABLED"),
    DEVICE_RELOAD_CONFIG_MINUTES("DEVICE_RELOAD_CONFIG_MINUTES"),
    DEVICE_SEND_ALERT_ADDRESS("DEVICE_SEND_ALERT_ADDRESS"),
    DEVICE_WIFI_REFRESH_MSEC("DEVICE_WIFI_REFRESH_MSEC"),
    DEVICE_WIFI_ZONE_REPORT_MSEC("DEVICE_WIFI_ZONE_REPORT_MSEC"),
    DEVICE_SAFE_ZONE_WIFI_REPORT_SLOWER_TIMES("DEVICE_SAFE_ZONE_WIFI_REPORT_SLOWER_TIMES"),
    DEVICE_GPS_COORDINATE_REPORT_MSEC("DEVICE_GPS_COORDINATE_REPORT_MSEC"),
    DEVICE_COLLECT_BSSID_MODE_ENABLED("DEVICE_COLLECT_BSSID_MODE_ENABLED"),
    DEVICE_REPORT_BSSID_URL_MASK("DEVICE_REPORT_BSSID_URL_MASK"),
    DEVICE_PING_ENABLED("DEVICE_PING_ENABLED"),
    DEVICE_PING_GATE_ADDRESS("DEVICE_PING_GATE_ADDRESS"),
    DEVICE_PING_ADDRESS("DEVICE_PING_ADDRESS"),
    DEVICE_PING_TEXT("DEVICE_PING_TEXT"),
    DEVICE_PING_MINUTES("DEVICE_PING_MINUTES"),
    DEVICE_LOCAL_LOGGING_ENABLED("DEVICE_LOCAL_LOGGING_ENABLED"),
    DEVICE_LOCAL_LOGGING_PATH("DEVICE_LOCAL_LOGGING_PATH"),
    DEVICE_LOCAL_LOGGING_EXPORT_ENABLED("DEVICE_LOCAL_LOGGING_EXPORT_ENABLED"),
    DEVICE_LOCAL_LOGGING_EXPORT_URL("DEVICE_LOCAL_LOGGING_EXPORT_URL"),
    DEVICE_LOCAL_LOGGING_DELETE_AFTER_SENT("DEVICE_LOCAL_LOGGING_DELETE_AFTER_SENT"),
    DEVICE_NOT_MOVED_THRESHOLD_MSEC("DEVICE_NOT_MOVED_THRESHOLD_MSEC"),
    DEVICE_ACCELEROMETER_THRESHOLD("DEVICE_ACCELEROMETER_THRESHOLD"),
    DEVICE_ACCELEROMETER_CHECK_TIME_MSEC("DEVICE_ACCELEROMETER_CHECK_TIME_MSEC"),
    DEVICE_SHUTDOWN_IF_NOT_IN_SAFE_ZONE("DEVICE_SHUTDOWN_IF_NOT_IN_SAFE_ZONE"),
    DEVICE_MAP_REPORT_GPS_ACCURACY_THRESHOLD("DEVICE_MAP_REPORT_GPS_ACCURACY_THRESHOLD"),
    DEVICE_MLS_FENCES("DEVICE_MLS_FENCES"),

    DEVICE_REPORT_URL_MASK("DEVICE_REPORT_URL_MASK");

    private final String configurationKey;

    /**
     * @param text
     */
    private ConfigurationKey(final String configurationKey) {
        this.configurationKey = configurationKey;
    }

    @Override
    public String toString() {
        return configurationKey;
    }

}
