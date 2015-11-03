package com.samao.ocpjp.chapter06.generics.and.collections;

import java.util.Comparator;

/**
 * Created by hsamao on 11/3/15.
 */
public class GPAComparator implements Comparator<Student> {


    @Override
    public int compare(Student currentStudent, Student previousStudent) {
        return (currentStudent.GPA.compareTo(previousStudent.GPA));
    }
}
