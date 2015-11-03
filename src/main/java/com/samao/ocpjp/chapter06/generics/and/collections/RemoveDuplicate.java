package com.samao.ocpjp.chapter06.generics.and.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hsamao on 11/2/15.
 */
public class RemoveDuplicate {

    public static void main(String[] args) {
        String tongueTwister = "I feel, a feel, a funny feel, a funny feel I feel, if you feel the feel I feel, I feel the feel you feel";

        Set<String> words = new HashSet<>();

        for(String word : tongueTwister.split("\\W+")) {
            words.add(word);
        }

        System.out.println("The tongue twister : " + tongueTwister);
        System.out.println("The words were used: ");
        System.out.println(words);
    }
}
