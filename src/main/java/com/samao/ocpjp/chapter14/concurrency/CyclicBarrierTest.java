package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by hsamao on 11/16/15.
 */
public class CyclicBarrierTest {

    public static void main (String [] args){

        System.out.println("Reserving tennis court \n As soon as four players arrive, game will start");

        CyclicBarrier barrier = new CyclicBarrier(4, new MixedDoubleTennisGame());
        new Player(barrier, "Joe");
        new Player(barrier, "Bob");
        new Player(barrier, "David");
        new Player(barrier, "Chris");
    }
}
