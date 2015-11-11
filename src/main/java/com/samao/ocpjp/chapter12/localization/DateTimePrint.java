package com.samao.ocpjp.chapter12.localization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by hsamao on 11/10/15.
 */
public class DateTimePrint {

    public static void main(String[] args) {
// the default constructor for the Date gets the current time and date
        Date today = new Date();
        Locale[] locales =
                {Locale.CANADA, Locale.FRANCE, Locale.GERMANY, Locale.ITALY};
// print the header first
        System.out.printf("%5s \t %10s \t %10s \t %10s %n",
                "Locale", "Date", "Time", "Date with Time");

        for (Locale locale : locales) {
            DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, locale);
            DateFormat timeFormat = DateFormat.getTimeInstance(DateFormat.SHORT, locale);
            DateFormat dateTimeFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, locale);

            System.out.printf("%5s \t %10s \t %10s \t %20s %n", locale,
                    dateFormat.format(today), timeFormat.format(today),
                    dateTimeFormat.format(today));
        }
    }
}
