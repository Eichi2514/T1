package org.example.SN.day11.s5;

import java.util.HashMap;
import java.util.Map;

public class s5 {
    public static void main(String[] args) {

//        List<Integer> ages = new ArrayList<>();
        Map<String, Integer> agesMap = new HashMap<>();
//        ages.add(22);
        agesMap.put("영희",22);
//        ages.add(20);
        agesMap.put("철수",20);
//        ages.add(33);
        agesMap.put("영수",33);
//
//        ages.remove(1);
//
//        System.out.println("철수 나이 : "+ages.get(0));
        System.out.println("철수 나이 : "+agesMap.get("철수"));
//        System.out.println("영희 나이 : "+ages.get(1));
        System.out.println("영희 나이 : "+agesMap.get("영희"));
//        System.out.println("영수 나이 : "+ages.get(2));
        System.out.println("영수 나이 : "+agesMap.get("영수"));

    }
}