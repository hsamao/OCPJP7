package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.Semaphore;

/**
 * Created by hsamao on 11/15/15.
 */
public class Person extends Thread{

    private Semaphore machines;

    public Person (Semaphore machines, String name){
        this.machines = machines;
        this.setName(name);
        this.start();
    }

    public void run(){

        try {
            System.out.println(getName() + " waiting for accessing the ATM machine");
            machines.acquire();
            System.out.println(getName() + " accessing the ATM machine");
            sleep(1000);
            machines.release();
            System.out.println(getName() + " is done using the ATM machine");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
