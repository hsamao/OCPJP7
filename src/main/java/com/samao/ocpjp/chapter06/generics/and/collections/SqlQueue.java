package com.samao.ocpjp.chapter06.generics.and.collections;

import org.springframework.stereotype.Component;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by hsamao on 11/3/15.
 */

@Component
public class SqlQueue {

    private Deque<String> slqQ = new ArrayDeque<>();

    public void addInQueue (String customer) {
        slqQ.add(customer);
    }

    public void removeFront() {
        slqQ.removeFirst();
    }

    public void removeBack(){
        slqQ.removeLast();
    }

    public void printQueue(){
        System.out.println("Special queue contains : "+ slqQ);
    }
}
