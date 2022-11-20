package com.java8;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Student {

    public Profile profile;
    private String name;
    private int year;
    private List<Integer> marks;


    // constructor getters and setters

}