package com.samao.ocpjp.chapter11.exception.and.assertion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by hsamao on 11/8/15.
 */
public class ScanInt2 {
    public static void main(String[] args) {
        System.out.println("Type an integer in the console : ");
        Scanner consoleScanner = new Scanner(System.in);

        try {
            System.out.println("You typed the integer value: " + consoleScanner.nextInt());
        } catch (InputMismatchException ex) {
            System.out.println("Error: you typed some text that is not an integer value...");
            System.out.println("The calls in the stack trace are: ");
            for (StackTraceElement methodCall : ex.getStackTrace())
                System.out.println(methodCall);
            }
        }
    }
