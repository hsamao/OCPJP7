package com.samao.ocpjp.chapter12.localization;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hsamao on 11/11/15.
 */
public class TimePattern {

    public static void main(String []args) {
// patterns from simple to complex ones
        String [] timeFormats = {
                "h:mm", /* h is hour in am/pm (1-12), m is minute */
                "hh 'o''clock'", /* '' is the escape sequence to print a single quote */
                "H:mm a", /* H is hour in day (0-23), a is am/pm*/
                "hh:mm:ss:SS", /* s is seconds, S is milliseconds */
                "K:mm:ss a, zzzz" /*K is hour in am/pm(0-11), z is time zone */
        };
        Date today = new Date();
        System.out.println("Default format for the time is " +
                DateFormat.getTimeInstance().format(today));
        for(String timeFormat : timeFormats) {
            System.out.printf("Time in pattern \"%s\" is %s %n", timeFormat,
                    new SimpleDateFormat(timeFormat).format(today));
        }
    }
}
