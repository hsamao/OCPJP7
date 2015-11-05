package com.samao.ocpjp.chapter08.io.fundamentals;

import java.io.Console;

/**
 * Created by hsamao on 11/5/15.
 */
public class SpecialCharHandling {

    public static void main (String [] args){

        String scandString = "å, ä, and ö";

        System.out.println("Printing scand directly with println : " + scandString);

        Console console = System.console();

        console.printf("Printing scand with console's printf method : " + scandString);
    }
}
