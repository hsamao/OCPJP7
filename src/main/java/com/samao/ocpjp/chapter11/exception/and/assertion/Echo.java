package com.samao.ocpjp.chapter11.exception.and.assertion;

/**
 * Created by hsamao on 11/8/15.
 */
public class Echo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No input passed to echo command... ");
            System.exit(-1);
        } else {
            for (String str : args) {
                System.out.print(str + " ");
            }
        }
    }
}
