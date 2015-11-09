package com.samao.ocpjp.chapter11.exception.and.assertion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by hsamao on 11/9/15.
 */
public class ThrowsClause1 {

    public static void main (String [] args) throws FileNotFoundException {
        System.out.println("Reading an integer from the file 'integer.txt': ");
        Scanner consoleScanner = new Scanner(new File("integer.txt"));
        System.out.println("You typed the integer value: " + consoleScanner.nextInt());
    }
}
