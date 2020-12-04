package com.zeroslope.infrastructure.utlities;

public class BrowserUtilties {

    public static void openBrowser(String url) {
        Runtime rt = Runtime.getRuntime();
        String os = getOperatingSystem();

        try {
            if (os.indexOf("win") >= 0) {
                rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
            } 
            else if (os.indexOf("mac") >= 0) {
                rt.exec("open " + url);
            } 
            else if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0) {

                String[] browsers = {
                    "chrome",
                    "firefox",
                    "mozilla",
                    "opera"
                };

                StringBuffer cmd = new StringBuffer();
                for (int i = 0; i < browsers.length; i++) {
                    cmd.append((i == 0 ? "" : " || ") + browsers[i] + " \"" + url + "\" ");
                }

                rt.exec(new String[] { "sh", "-c", cmd.toString() });
            }
        } catch(Exception e) { }
    }

    private static String getOperatingSystem() {
        return System.getProperty("os.name").toLowerCase();
    }
}