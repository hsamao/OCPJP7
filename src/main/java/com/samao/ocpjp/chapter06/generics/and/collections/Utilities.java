package com.samao.ocpjp.chapter06.generics.and.collections;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by hsamao on 11/2/15.
 */

@Component
public class Utilities {

    public static <T> void fill (List<T> list, T value) {
        for (int i = 0; i <list.size(); i++) {
            list.set(i, value);
        }
    }
}
