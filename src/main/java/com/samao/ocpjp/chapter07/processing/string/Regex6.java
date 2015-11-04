package com.samao.ocpjp.chapter07.processing.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by hsamao on 11/4/15.
 */
public class Regex6 {

    public static void main (String [] args){

        String str = "\"Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone,\n" +
                "Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank post\n" +
                "office, Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.";

        Pattern pattern = Pattern.compile("(\\D)(\\d{3})(\\d{7})(\\D)");
        Matcher matcher = pattern.matcher(str);

        String str2 = matcher.replaceAll("$1$2-$3$4");

        System.out.println(str2);
    }
}
