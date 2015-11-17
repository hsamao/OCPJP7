package com.samao.ocpjp.chapter14.concurrency;

/**
 * Created by hsamao on 11/17/15.
 */
public class ExecutorTest {

    public static void main (String [] args){
        Runnable runnable = new Task();
        System.out.println("Calling Task.run by directly creating a Thread object");
        Thread thread = new Thread(runnable);
        thread.start();

        RepeatedExecutor executor = new RepeatedExecutor();
        executor.execute(runnable, 3);
    }
}
