package com.dsa.implarray;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        String str = "I am a java developer and I am proud of it";
        String[] strArray = str.split(" ");

        List<String> duplicates = new ArrayList<>();

        Map<String,Integer> hashMap = new HashMap<>();
        for(String s : strArray){
            if (!hashMap.containsKey(s)){
                hashMap.put(s,1);
            }
            else {
                duplicates.add(s);
                int falg = hashMap.get(s);
                hashMap.put(s, ++falg);
            }
        }
        System.out.println("Duplicate elements " + duplicates);
        System.out.println(hashMap);
    }
}
