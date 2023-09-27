package com.leetcode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@ToString
class Employee{
    int id;
    String name;
    String email;
}
public class Test {
    public static void main(String[] args) {
        Map<String , Employee> stringEmployeeHashMap = new HashMap<>();
        stringEmployeeHashMap.put("emp1", new Employee(12, "Shrikar", "abc@gmail.com"));
        stringEmployeeHashMap.put("emp2", new Employee(13, "Mukesh", "mukesh@gmail.com"));
        Test t = new Test();
        t.print(stringEmployeeHashMap);


    }
    public void print(Map<String, Employee> stringEmployeeHashMap){
        stringEmployeeHashMap.values().stream().sorted(Comparator.comparing(Employee::getEmail)).forEach(System.out::println);
    }
}
