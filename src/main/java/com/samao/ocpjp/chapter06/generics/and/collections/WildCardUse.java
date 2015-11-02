package com.samao.ocpjp.chapter06.generics.and.collections;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by hsamao on 11/2/15.
 */

@Component
public class WildCardUse {

    static void printList (List<?> list) {
        for (Object list1: list){
            System.out.println(list1);
        }
    }
}
