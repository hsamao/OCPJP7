package com.samao.ocpjp.chapter06.generics.and.collections;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 11/3/15.
 */

@Component
public class Student implements Comparable <Student> {

    private String id;
    private String name;
    private Double GPA;

    public Student() {
    }

    public Student(String id, String name, Double GPA) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Student student) {
        return id.compareTo(student.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
