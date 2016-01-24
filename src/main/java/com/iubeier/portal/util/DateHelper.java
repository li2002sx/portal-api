package com.iubeier.portal.util;

/**
 * Created by jankie on 16/1/24.
 */
public class DateHelper {
    public String TimeStamp2Date(String timestampString, String formats){
        Long timestamp = Long.parseLong(timestampString)*1000;
        String date = new java.text.SimpleDateFormat(formats).format(new java.util.Date(timestamp));
        return date;
    }
}
