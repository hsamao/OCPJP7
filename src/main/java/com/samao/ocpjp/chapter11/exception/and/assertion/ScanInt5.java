package com.samao.ocpjp.chapter11.exception.and.assertion;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by hsamao on 11/8/15.
 */
public class ScanInt5 {
    public static void main (String [] args){
        String integerStr = "";
        System.out.println("The string to scan integer from it is: " + integerStr);
        Scanner consoleScanner = new Scanner(integerStr);

        try {
            System.out.println("The integer value scanned from string is: " + consoleScanner.nextInt());
        } catch (NoSuchElementException | IllegalStateException multi){
            System.out.println("Error: An error occurred while attempting to scan the integer");
        }
    }
}
