package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Shrikar");
        student.setMarks(List.of(12,22));

        List<Student> students= Arrays.asList(student);
        if(1+1+1 == 3){
            System.out.println("TRUE");
        }

    }
}
