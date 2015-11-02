package com.samao.ocpjp.chapter06.generics.and.collections;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 11/2/15.
 */

@Component
public class PairOfT <T>{

    T value1;
    T Value2;

    public PairOfT() {
    }

    public PairOfT(T value1, T value2) {
        this.value1 = value1;
        Value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public T getValue2() {
        return Value2;
    }
}
