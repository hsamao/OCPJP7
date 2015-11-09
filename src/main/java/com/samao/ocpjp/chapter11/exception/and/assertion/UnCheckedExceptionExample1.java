package com.samao.ocpjp.chapter11.exception.and.assertion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by hsamao on 11/8/15.
 */
public class UnCheckedExceptionExample1 {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream(args[0]);

    }
}
