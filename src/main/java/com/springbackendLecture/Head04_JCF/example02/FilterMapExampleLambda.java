package com.springbackendLecture.Head04_JCF.example02;

import java.util.HashMap;
import java.util.Map;

public class FilterMapExampleLambda {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Choi", 90);
        scores.put("Lee", 80);
        scores.put("Park", 70);

        scores.entrySet().stream()
                .filter(entry -> entry.getValue() >= 80)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

    }
}
