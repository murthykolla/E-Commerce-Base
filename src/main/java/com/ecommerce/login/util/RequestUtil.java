package com.ecommerce.login.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class RequestUtil {

    private final Logger log = LoggerFactory.getLogger(RequestUtil.class);

    //Constructor
    public RequestUtil() {
    }

    /**
     * Method to get the application's URL based on request.
     */
    public static String getAppURL(HttpServletRequest request) {
        if (request == null) {
            return "";
        }

        StringBuffer url = new StringBuffer();
        int port = request.getServerPort();
        if (port < 0) {
            port = 80; // Work around java.net.URL bug
        }
        String scheme = request.getScheme();
        url.append(scheme);
        url.append("://");
        url.append(request.getServerName());
        if ((scheme.equals("http") && (port != 80))
                || (scheme.equals("https") && (port != 443))) {
            url.append(':');
            url.append(port);
        }
        url.append(request.getContextPath());
        return url.toString();
    }
}
