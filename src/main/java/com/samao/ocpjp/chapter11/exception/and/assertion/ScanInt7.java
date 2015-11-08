package com.samao.ocpjp.chapter11.exception.and.assertion;

import java.util.Scanner;

/**
 * Created by hsamao on 11/8/15.
 */
public class ScanInt7 {
    public static void main (String [] args){

        System.out.println("Type an integer in the console: ");
        Scanner consoleScanner = new Scanner(System.in);

        try {
            System.out.println("The integer value scanned from string is: " + consoleScanner.nextInt());

        } catch (Exception ex){
            System.out.println("Error: Encountered an exception and could not read an integer from the console ...");
            System.out.println("Exiting the program - restart and try the program again!");
        } finally {
            System.out.println("Done reading the text... closing the Scanner");
            consoleScanner.close();
        }
    }
}
