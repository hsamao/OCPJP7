package com.samao.ocpjp.chapter07.processing.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by hsamao on 11/4/15.
 */
public class Regex5 {

    public static void main (String [] args){

        String str = "\"Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone,\n" +
                "Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank post\n" +
                "office, Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.\"";

        Pattern pattern = Pattern.compile("\\w+@\\w+\\.com");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
