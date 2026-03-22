package com.springbackendLecture.Head04_JCF.example02;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapEntryTransformationExample {
    public static void main(String[] args) {
        //학생 점수 정보
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Choi", 90);
        scores.put("Lee", 80);
        scores.put("Kim", 70);

        //Map.Entry<String, Integer> -> 문자열 변환
        Function<Map.Entry<String, Integer>, String> entryToString =
                new Function<Map.Entry<String, Integer>, String>() {
                    @Override
                    public String apply(Map.Entry<String, Integer> e) {
                        return e.getKey() + ": " + e.getValue();
                    }
                };
        scores.entrySet().stream()
                .map(entryToString)
                .forEach(System.out::println);

    }
}
