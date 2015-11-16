package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.Phaser;

/**
 * Created by hsamao on 11/16/15.
 */
public class Worker extends Thread {

    Phaser deliveryOrder;

    public Worker(Phaser deliveryOrder, String name) {
        this.deliveryOrder = deliveryOrder;
        this.setName(name);
        deliveryOrder.register();
        this.start();
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            if (i == 3) {
                deliveryOrder.arriveAndDeregister();
            } else {
                deliveryOrder.arriveAndAwaitAdvance();
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
