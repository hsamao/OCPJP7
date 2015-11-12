package com.samao.ocpjp.chapter13.threads;

/**
 * Created by hsamao on 11/11/15.
 */
public class CoffeeShop {

    public static void main(String []s) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Waiter waiter = new Waiter();
        coffeeMachine.start();
        waiter.start();
    }
}
