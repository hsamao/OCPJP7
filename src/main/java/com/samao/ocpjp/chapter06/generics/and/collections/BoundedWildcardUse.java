package com.samao.ocpjp.chapter06.generics.and.collections;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by hsamao on 11/2/15.
 */

@Component
public class BoundedWildcardUse {

    public Double printList (List<? extends Number> numList) {
        Double sum = 0.0;

        for (Number list : numList){
            sum += list.doubleValue();
        }
        return sum;
    }
}
