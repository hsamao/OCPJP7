package com.samao.ocpjp.chapter11.exception.and.assertion;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by hsamao on 11/8/15.
 */
public class ScanInt4 {
    public static void main (String [] args){
        String integerStr = "";
        System.out.println("The string to scan integer from it is: " + integerStr);
        Scanner consoleScanner = new Scanner(integerStr);

        try {
            System.out.println("The integer value scanned from string is: " + consoleScanner.nextInt());
        } catch (InputMismatchException ex){
            System.out.println("Error: Cannot scan an integer from the given string");
        } catch (NoSuchElementException ex){
            System.out.println("Error: Cannot scan an integer from the given string");
        } catch (IllegalStateException ex){
            System.out.println("Error: nextInt() called on a closed Scanner object");
        }
    }
}
