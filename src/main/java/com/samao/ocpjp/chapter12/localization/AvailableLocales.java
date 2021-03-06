package com.samao.ocpjp.chapter12.localization;

import java.util.Locale;

/**
 * Created by hsamao on 11/9/15.
 */
public class AvailableLocales {

    public static void main(String[] args) {

        System.out.println("The default locale is : " + Locale.getDefault());

        Locale[] locales = Locale.getAvailableLocales();

        System.out.printf("No. of other available locales is: %d, and they are: %n", locales.length);

        for (Locale locale : locales) {
            if(locale.getLanguage().equals("en")){
                System.out.printf("Locale code: %s and it stands for %s %n",
                        locale, locale.getDisplayName());
            }

            //System.out.printf("Locale code: %s and it stands for %s %n", locale, locale.getDisplayName());
        }
    }
}
