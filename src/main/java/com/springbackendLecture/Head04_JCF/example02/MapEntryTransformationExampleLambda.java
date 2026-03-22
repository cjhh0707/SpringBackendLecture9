package com.springbackendLecture.Head04_JCF.example02;
import java.util.HashMap;
import java.util.Map;

public class MapEntryTransformationExampleLambda {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Choi", 90);
        scores.put("Lee", 80);
        scores.put("Kim", 70);

        scores.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);
    }
}
