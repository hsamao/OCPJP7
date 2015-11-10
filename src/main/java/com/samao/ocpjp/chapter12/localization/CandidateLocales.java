package com.samao.ocpjp.chapter12.localization;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by hsamao on 11/10/15.
 */
public class CandidateLocales {

    public static void loadResourceBundle(String resourceBundleName, Locale locale) {

        ResourceBundle resourceBundle = ResourceBundle.getBundle(resourceBundleName, locale, new TalkativeResourceBundleControl());
        String rbLocaleName = resourceBundle.getLocale().toString();

        if (rbLocaleName == "") {
            System.out.println("Loaded the default property file with name: " + resourceBundleName);
        } else {
            System.out.println("Loaded the resource bundle for the locale: " + resourceBundleName + "." + rbLocaleName);
        }
    }

    public static void main(String[] args) {
        loadResourceBundle("ResourceBundle", new Locale("it", "IT", "Rome"));
    }
}
