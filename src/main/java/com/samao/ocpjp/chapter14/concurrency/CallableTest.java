package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.*;

/**
 * Created by hsamao on 11/17/15.
 */
public class CallableTest {

    public static void main (String [] args) throws ExecutionException, InterruptedException {
        long N = 20;

        Callable<Long> task = new Factorial(N);

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Long> future = executorService.submit(task);

        System.out.printf("factorial of %d is %d", N, future.get());

        executorService.shutdown();
    }
}
