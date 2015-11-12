package com.samao.ocpjp.chapter13.threads;

/**
 * Created by hsamao on 11/12/15.
 */
public class ThreadStatesEnumeration {

    public static void main (String [] args){
        for (Thread.State state : Thread.State.values()){
            System.out.println(state);
        }
    }
}
