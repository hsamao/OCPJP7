package com.samao.ocpjp.chapter11.exception.and.assertion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by hsamao on 11/9/15.
 */
public class ThrowsClause3 {

    public int readIntFromFile() throws FileNotFoundException {
        Scanner consoleScanner = new Scanner(new File("integer.txt"));
        return consoleScanner.nextInt();
    }
    // since readIntFromFile() throws FileNotFoundException and main() does not handle
// it, the main() method declares this exception in its throws cause
    public static void main(String []args) throws FileNotFoundException {
        System.out.println("Reading an integer from the file 'integer.txt': ");
        System.out.println("You typed the integer value: " +
                new ThrowsClause3().readIntFromFile());
    }
}
