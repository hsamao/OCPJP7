package com.samao.ocpjp.chapter06.generics.and.collections;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 11/2/15.
 */

@Component
public class Pair<T1, T2> {

    private T1 firstValue;
    private T2 secondValue;

    public Pair() {
    }

    public Pair(T1 firstValue, T2 secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public T1 getFirstValue() {
        return firstValue;
    }

    public T2 getSecondValue() {
        return secondValue;
    }

    @Override
    public String toString() {
        return "World Cup: " + firstValue +
                " in " +
                secondValue;
    }
}
