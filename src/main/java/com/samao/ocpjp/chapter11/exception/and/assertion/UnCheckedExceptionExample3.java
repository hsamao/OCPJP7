package com.samao.ocpjp.chapter11.exception.and.assertion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by hsamao on 11/8/15.
 */
public class UnCheckedExceptionExample3 {

    public static void main(String[] args) throws FileNotFoundException {
        if (args.length >= 1) {
            FileInputStream fis = new FileInputStream(args[0]);
        } else {
            System.out.println("Error: No arguments passed in the commandline!");
            System.out.println("Pass the name of the file to open as commandline argument");
        }
    }
}
