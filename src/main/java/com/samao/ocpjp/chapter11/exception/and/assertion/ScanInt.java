package com.samao.ocpjp.chapter11.exception.and.assertion;

import java.util.Scanner;

/**
 * Created by hsamao on 11/8/15.
 */
public class ScanInt {
    public static void main(String [] args){
        System.out.println("Type an integer in the console");
        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("You typed the intger value: " + consoleScanner.nextInt());

    }
}
