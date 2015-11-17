package com.samao.ocpjp.chapter14.concurrency;

/**
 * Created by hsamao on 11/17/15.
 */
public class ExecutorTest {

    public static void main (String [] args){
        Runnable runnable = new Task();
        System.out.println("Calling Tast.run by directly creating a Thread object");
        Thread thread = new Thread(runnable);
        thread.start();
        RepeatedExcutor excutor = new RepeatedExcutor();
        excutor.execute(runnable, 3);
    }
}
