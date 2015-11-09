package com.samao.ocpjp.chapter11.exception.and.assertion;

/**
 * Created by hsamao on 11/9/15.
 */
public class AssertionExample1 {
        public static void main(String []args) {
            int i = -2147483648;
            if(i < 0) {
// if negative value, convert into positive value
                i = -i;
            }
            System.out.println("the value of i is: " + i);
// at this point the assumption is that i cannot be negative;
// assert this condition since its an assumption that will always hold
            assert (i >= 0) : "impossible: i is negative!";
        }
}
