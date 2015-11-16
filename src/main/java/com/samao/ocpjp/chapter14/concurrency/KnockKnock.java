package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.Exchanger;

/**
 * Created by hsamao on 11/16/15.
 */
public class KnockKnock {

    public static void main(String[] args) {
        Exchanger<String> sillTalk = new Exchanger<>();

        new DukeThread(sillTalk).start();
        new CoffeeShopThread(sillTalk).start();
    }
}
