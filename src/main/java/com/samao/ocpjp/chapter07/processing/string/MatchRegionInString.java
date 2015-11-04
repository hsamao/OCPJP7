package com.samao.ocpjp.chapter07.processing.string;

/**
 * Created by hsamao on 11/3/15.
 */
public class MatchRegionInString {

    public static void main(String[] args) {
        String chat = "Tarzan: Hi Jane, wanna ride an Elephant? \n Jane: No thanks! I am preparing for OCPJP now!";

        System.out.println(chat);

        String matchString = " Jane: No thanks!";

        int startIndex = chat.indexOf('\n');

        System.out.println("\nJane's response start at index " + startIndex);

        if (startIndex > -1) {
            Boolean doesMatch = chat.regionMatches(startIndex + 1, matchString, 0, matchString.length());

            if(doesMatch) System.out.println("\nJane's response matches with the string " + matchString);
        }
    }
}
