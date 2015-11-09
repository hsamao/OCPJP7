package com.samao.ocpjp.chapter11.exception.and.assertion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by hsamao on 11/8/15.
 */
public class CheckedExceptionExample1 {

    public static void main(String []args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Error: There is no file that exists with name " + args[0]);
            System.out.println("Pass a valid file name as commandline argument!");
        }
    }
}
