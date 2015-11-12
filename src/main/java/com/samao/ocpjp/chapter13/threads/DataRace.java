package com.samao.ocpjp.chapter13.threads;

/**
 * Created by hsamao on 11/11/15.
 */
public class DataRace  {

    public static void main (String [] args){
        UserCounter userCounter = new UserCounter();

        Thread thread = new Thread (userCounter);
        Thread thread1 = new Thread (userCounter);
        Thread thread2 = new Thread (userCounter);

        thread.start();
        thread1.start();
        thread2.start();
    }
}
