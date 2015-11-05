package com.samao.ocpjp.chapter07.processing.string;

import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

/**
 * Created by hsamao on 11/4/15.
 */

@Component
public class Regex7 {

    public void validateIP(String ipStr) {
        String regex = "\\b((25[0–5]|2[0–4]\\d|[01]?\\d\\d?)(\\.)){3}(25[0–5]|2[0–4]\\d|[01]?\\d\\d?)\\b";
        System.out.println(ipStr + " is valid? " + Pattern.matches(regex, ipStr));
    }
}
