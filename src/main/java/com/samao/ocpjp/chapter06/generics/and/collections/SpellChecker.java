package com.samao.ocpjp.chapter06.generics.and.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hsamao on 11/3/15.
 */
public class SpellChecker {

    public static void main(String[] args) {

        Map<String, String> mispelledChecker = new HashMap<>();

        mispelledChecker.put("calender", "calendar");
        mispelledChecker.put("tomatos", "tomatoes");
        mispelledChecker.put("aquaintance", "acquaintance");
        mispelledChecker.put("existance", "existence");

        String sentence = "Buy a calender for year 2015";

        for (String word : sentence.split("\\W+")) {
            if (mispelledChecker.containsKey(word)) {
                System.out.println("The correct spelling of " + word + " is " + mispelledChecker.get(word));
            }
        }
    }
}
