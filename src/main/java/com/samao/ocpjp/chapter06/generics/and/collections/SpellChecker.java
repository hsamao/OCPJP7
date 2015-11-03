package com.samao.ocpjp.chapter06.generics.and.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by hsamao on 11/3/15.
 */
public class SpellChecker {

    public static void main(String[] args) {

        Map<String, String> misspelledChecker = new HashMap<>();

        misspelledChecker.put("calender", "calendar");
        misspelledChecker.put("tomatos", "tomatoes");
        misspelledChecker.put("aquaintance", "acquaintance");
        misspelledChecker.put("existance", "existence");

        String sentence = "Buy a calender for year 2015";

        for (String word : sentence.split("\\W+")) {
            if (misspelledChecker.containsKey(word)) {
                System.out.println("The correct spelling of " + word + " is " + misspelledChecker.get(word));
            }
        }
        Set<String> keys = misspelledChecker.keySet();
        Collection values = misspelledChecker.values();

        System.out.println("Misspelled words in spell checker are " + keys);
        System.out.println("Correct words in spell checker are " + values);
    }
}
