package com.samao.ocpjp.chapter07.processing.string;

/**
 * Created by hsamao on 11/3/15.
 */
public class SearchString3 {

    public static void main(String[] args) {

        String statement = "I am a student. I am preparing for OCPJP";

        int fromIndex = 0;

        while (statement.indexOf("am", fromIndex) > -1) {
            fromIndex = statement.indexOf("am", fromIndex);
            System.out.println("Substring \"am\" ocurrs at index " + fromIndex);
            fromIndex++;
        }
    }
}
