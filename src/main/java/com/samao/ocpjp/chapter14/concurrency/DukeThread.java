package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.Exchanger;

/**
 * Created by hsamao on 11/16/15.
 */
public class DukeThread extends Thread {

    private Exchanger<String> sillTalk;

    public DukeThread(Exchanger<String> sillTalk) {
        this.sillTalk = sillTalk;
    }

    public void run() {
        String reply = null;
        try {
            reply = sillTalk.exchange("knock knock!");
            System.out.println("coffee shop: " + reply);

            reply = sillTalk.exchange("Duke");
            System.out.println("coffee shop: " + reply);

            reply = sillTalk.exchange("the one who was born in this coffee shop!");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
