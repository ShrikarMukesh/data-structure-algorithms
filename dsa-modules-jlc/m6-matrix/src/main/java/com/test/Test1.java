package com.test;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> integerList  = Arrays.asList(1,2,4,7,2,7,4,8,4,8);
        Set<Integer> integers = integerList.stream().filter(integer -> Collections.frequency(integerList,integer) > 1).collect(Collectors.toSet());
        System.out.println(integers);

        //integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
