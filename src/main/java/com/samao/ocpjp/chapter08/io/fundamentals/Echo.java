package com.samao.ocpjp.chapter08.io.fundamentals;

import java.io.Console;

/**
 * Created by hsamao on 11/5/15.
 */
public class Echo {

    public static void main (String [] args){

        Console console = System.console();

        if(console ==null){
            System.out.println("Cannot retrieve console object - are  you running your application form an IDE? " +
                    "Exiting the application ... ");
            System.exit(-1);
        }
        console.printf(console.readLine());
    }
}
