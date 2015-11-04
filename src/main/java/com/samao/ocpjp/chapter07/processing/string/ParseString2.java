package com.samao.ocpjp.chapter07.processing.string;

/**
 * Created by hsamao on 11/4/15.
 */
public class ParseString2 {

    public static void main (String [] args) {

        String filePath = "c:\\work\\programs\\parser";

        System.out.println(filePath);

        String [] filePathList = filePath.split("\\\\");

        for(String words : filePathList)
            System.out.println(words);
    }
}
