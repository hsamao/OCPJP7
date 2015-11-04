package com.samao.ocpjp.chapter07.processing.string;

import java.util.Arrays;

/**
 * Created by hsamao on 11/4/15.
 */
public class ParseString1 {

    public static void main(String[] args) {

        String quote = "Never lend books-nobody ever returns them!";

        String[] words = quote.split(" ");

        for (String word : words)
            System.out.println(word);

        System.out.println(Arrays.toString(words));
    }
}
