package me.veryyoung.dingding.unrecalled;

/**
 * Created by veryyoung on 2017/1/9.
 */
public class VersionParam {

    public static String MessageDs = "dey";

    public static void init(String version) {
        switch (version) {
            case "3.3.0":
            case "3.3.1":
                MessageDs = "cuw";
                break;
            case "3.3.3":
            case "3.3.5":
                MessageDs = "cwz";
                break;
            case "3.4.0":
                MessageDs = "cuy";
                break;
            case "3.4.6":
                MessageDs = "cxw";
                break;
            case "3.4.8":
                MessageDs = "dey";
                break;
            default:
                MessageDs = "dey";

        }
    }

}