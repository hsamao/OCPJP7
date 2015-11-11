package com.samao.ocpjp.chapter12.localization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by hsamao on 11/10/15.
 */
public class DatePrint {

    public static void main(String[] args) {

        Date today = new Date();
        Locale[] locales = {Locale.CANADA, Locale.FRANCE, Locale.GERMANY, Locale.ITALY};

        for (Locale locale : locales) {
            DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
            System.out.println("Date in locale " + locale + " is: " + dateFormat.
                    format(today));
        }
    }
}
