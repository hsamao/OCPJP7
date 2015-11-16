package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.Exchanger;

/**
 * Created by hsamao on 11/16/15.
 */
public class CoffeeShopThread extends Thread {

    private Exchanger<String> sillTalk;

    public CoffeeShopThread(Exchanger<String> sillTalk) {
        this.sillTalk = sillTalk;
    }

    public void run () {
        String reply = null;

        try {
            reply = sillTalk.exchange("Who's there");
            System.out.println("Duke: " + reply);

            reply = sillTalk.exchange("Duke who?");
            System.out.println("Duke: " + reply);

            reply = sillTalk.exchange("");
            System.out.println("Duke: " + reply);



        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
