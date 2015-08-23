package core.utils;

/**
 * @author imy@ciklum.com
 */
public class CustomProperties {
    private static String schema;
    private static String host;
    private static String port;

    static {
        schema = System.getProperty("schema", "http");
    }

    public static String getBaseURLAsString() {
        return schema + "://" + host + ":" + port;
    }

    public static String getBaseURLWithoutPortAsString() {
        return schema + "://" + host;
    }

}
