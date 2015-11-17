package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.Executor;

/**
 * Created by hsamao on 11/17/15.
 */
public class RepeatedExcutor implements Executor {

    @Override
    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }

    public void execute(Runnable runnable, int times) {
        System.out.printf("Calling Task.run() thro' Executor.execute() for %d times %n", times);
        for (int i = 0; i < times; i++) {
            execute(runnable);
        }
    }
}
