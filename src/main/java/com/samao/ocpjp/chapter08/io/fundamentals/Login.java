package com.samao.ocpjp.chapter08.io.fundamentals;

import java.io.Console;
import java.util.Arrays;

/**
 * Created by hsamao on 11/5/15.
 */
public class Login {

    public static void main (String [] args){

        Console console = System.console();

        if(console != null){
            String userName = null;
            char [] password = null;

            userName = console.readLine("Enter your username: ");
            password = console.readPassword("Enter your password: ");

            if(userName.equals("scrat") && new String(password).equals("nuts")) {
                // we're hardcoding username and password here for
                // illustration, don't do such hardcoding in pratice!
                console.printf("login successful!");
                System.out.println();
            }
            else {
                console.printf("restart application and try again");
                System.out.println();
            }
            Arrays.fill(password, ' ');
        }
    }
}
