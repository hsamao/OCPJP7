package com.samao.ocpjp.chapter13.threads;

/**
 * Created by hsamao on 11/11/15.
 */
public class CounterRunBall implements Runnable{

    public void incrementBallAfterRun() {
        synchronized (Run.class) {
            synchronized (Ball.class) {
                Run.run++;
                Ball.ball++;
            }
        }
    }

    public void incrementRunAfterRun() {
        synchronized (Ball.class) {
            synchronized (Run.class) {
                Ball.ball++;
                Run.run++;
            }
        }
    }

    public void run() {
        incrementBallAfterRun();
        incrementRunAfterRun();
    }
}
