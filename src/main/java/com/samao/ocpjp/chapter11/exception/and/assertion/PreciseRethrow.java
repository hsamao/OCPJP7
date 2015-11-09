package com.samao.ocpjp.chapter11.exception.and.assertion;

/**
 * Created by hsamao on 11/8/15.
 */
public class PreciseRethrow {

    public static void main(String[] str) {
        try {
            foo();
        } catch (NumberFormatException ife) {
            System.out.println(ife);
        }
    }

    static private void foo() throws NumberFormatException {
        try {
            int i = Integer.parseInt("ten");
        } catch (Exception e) {
            throw e;
        }
    }
}
