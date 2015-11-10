package com.samao.ocpjp.chapter12.localization;

import java.util.Locale;

/**
 * Created by hsamao on 11/10/15.
 */
public class LocaleDetails {

    public static void main(String[] args) {

        Locale.setDefault(Locale.CANADA_FRENCH);
        Locale defaultLocale = Locale.getDefault();
        System.out.printf("The default locale is %s %n", defaultLocale);
        System.out.printf("The default language code is %s and the name is %s %n",
                defaultLocale.getLanguage(), defaultLocale.getDisplayCountry());
        System.out.printf("The default country code is %s and the name is %s %n",
                defaultLocale.getCountry(), defaultLocale.getDisplayCountry());
        System.out.printf("The default variant code is %s and the name is %s %n",
                defaultLocale.getVariant(), defaultLocale.getDisplayVariant());
    }

}
