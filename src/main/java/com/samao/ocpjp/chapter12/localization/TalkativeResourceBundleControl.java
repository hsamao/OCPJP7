package com.samao.ocpjp.chapter12.localization;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by hsamao on 11/10/15.
 */
public class TalkativeResourceBundleControl extends ResourceBundle.Control {

    public List<Locale> getCandidateLocale(String baseName, Locale locale) {

        List<Locale> candidateLocales = super.getCandidateLocales(baseName, locale);
        System.out.printf("Candidate locales for base bundle name %s and locale %s %n", baseName, locale.getDisplayName());
        for (Locale candidateLocale : candidateLocales) {
            System.out.println(candidateLocale);
        }
        return candidateLocales;
    }
}
