package com.samao.ocpjp.chapter11.exception.and.assertion;

/**
 * Created by hsamao on 11/9/15.
 */
public class NonTerminatingRecursion {

    static int factorial(int n) {
        int result = 0;

        //if (n == 0) return 1;
        result = factorial(n - 1) * n;
        return result;
    }

    public static void main(String... args) {
        System.out.println("factorial of 4 is: " + factorial(4));
    }
}
