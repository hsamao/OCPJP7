package com.samao.ocpjp.chapter11.exception.and.assertion;

import java.util.Scanner;

/**
 * Created by hsamao on 11/8/15.
 */
public class TryWithResources2 {

    public static void main (String [] args){

        System.out.println("Type an integer in the console: ");

        try (Scanner consoleScanner = new Scanner(System.in)) {
            System.out.println("The integer value scanned from string is: " + consoleScanner.nextInt());

        }
    }
}
