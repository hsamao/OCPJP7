package com.samao.ocpjp.chapter11.exception.and.assertion;

/**
 * Created by hsamao on 11/8/15.
 */
public class ChainedException {
    public static void foo(){
        try {
            String[] str = {"foo"};
            System.out.println("About to throw ArrayIndexOutOfBoundsException");
            String functionName = str [10];
        } catch (ArrayIndexOutOfBoundsException oob ){
            System.out.println("Wrapping Array IndexOutOfBoundsException into a Runtime Exception");
            throw new RuntimeException(oob);
        }
    }

    public static void main (String [] args){
        try {
            foo();
        } catch (Exception re){
            System.out.println("The caught exception in main is: " + re.getClass());
            System.out.println("The cause of the exception is: " + re.getCause());
        }
    }
}
