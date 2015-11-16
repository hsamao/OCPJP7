package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.Phaser;

/**
 * Created by hsamao on 11/16/15.
 */
public class ProcessOrder {


    public static void main(String[] args) throws InterruptedException {

        Phaser deliveryOrder = new Phaser(1);

        System.out.println("Starting to process the delivery order ");

        new Worker(deliveryOrder, "Cook");
        new Worker(deliveryOrder, "Helper");
        new Worker(deliveryOrder, "Attendant");

        for (int i = 1; i <= 3; i++) {

            deliveryOrder.arriveAndAwaitAdvance();
            System.out.println("Deliver food item no. " + i);
        }
        deliveryOrder.arriveAndDeregister();
        System.out.println("Delivery order completed... give it to the customer");
    }
}

