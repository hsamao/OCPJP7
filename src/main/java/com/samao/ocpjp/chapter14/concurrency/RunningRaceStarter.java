package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.CountDownLatch;

/**
 * Created by hsamao on 11/15/15.
 */
public class RunningRaceStarter {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch counter = new CountDownLatch(5);

        new Runner(counter, "Carl");
        new Runner(counter, "Joe");
        new Runner(counter, "Jack");

        System.out.println("Starting countdown");

        long countVal = counter.getCount();

        while (countVal > 0) {
            Thread.sleep(1000);
            System.out.println(countVal);
            if (countVal == 1) {
                System.out.println("start");
            }
            counter.countDown();
            countVal = counter.getCount();
        }

    }


}
