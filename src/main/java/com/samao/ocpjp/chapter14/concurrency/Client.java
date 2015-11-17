package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.locks.Lock;

/**
 * Created by hsamao on 11/17/15.
 */
public class Client extends Thread {

    private Lock machine;

    public Client(Lock machine, String name) {
        this.machine = machine;
        this.setName(name);
        this.start();
    }

    public void run() {

        try {
            System.out.println(getName() + " waiting to access an ATM machine");
            machine.lock();
            System.out.println(getName() + " is accessing an ATM machine");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            System.out.println(getName() + " is done using the ATM machine");
            machine.unlock();
        }
    }
}
