package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by hsamao on 11/16/15.
 */
public class Player extends Thread {

    CyclicBarrier waitPoint;

    public Player(CyclicBarrier waitPoint, String name) {
        this.waitPoint = waitPoint;
        this.setName(name);
        this.start();
    }

    public void run (){

        System.out.println("Player " + getName() + " is ready ");

        try {
            waitPoint.await();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
