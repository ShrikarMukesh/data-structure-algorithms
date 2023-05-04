package com.dsa.implarray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list1= new ArrayList<>();
        list1.add("shrikar"); list1.add("shrikar"); list1.add("Mukesh");

        ArrayList<String> list2= new ArrayList<>();
        list2.add("arun"); list2.add("arun"); list2.add("kumar");

        ArrayList<String> list3 = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        for(String str : list1){
            int flag =0;
            if(map.containsKey(str)){

                list3.add(str);
            }
            else{
                map.put(str, flag);
                flag = map.get(str);
            }
        }
        System.out.println(map);

    }
}
