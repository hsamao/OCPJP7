package com.samao.ocpjp.chapter03.class_design.listing_3_1;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/29/15.
 */

@Component
public class TestNumber {

    public double sum (Number [] numbers) throws Exception{
        double sum = 0.0;

        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }


}
