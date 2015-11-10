package com.samao.ocpjp.chapter12.localization;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by hsamao on 11/10/15.
 */
public class LocalizedCurrency {

    public static void main(String[] args) {
        long tenMillion = 10000000l;

        Locale[] locales = {Locale.getDefault(), Locale.CANADA, Locale.FRANCE, Locale.CHINA, Locale.TAIWAN};

        for (Locale locale : locales) {
            System.out.printf("Ten Million in %s is %s %n", "(" + locale.getDisplayCountry() + ")",
                    NumberFormat.getCurrencyInstance(locale).format(tenMillion));
        }
    }
}
