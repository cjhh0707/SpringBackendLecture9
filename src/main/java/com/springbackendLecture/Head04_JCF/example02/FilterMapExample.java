package com.springbackendLecture.Head04_JCF.example02;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class FilterMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Choi", 90);
        scores.put("Lee", 80);
        scores.put("Park", 70);

        //익명 클래스를 사용한 Predicate > 점수가 80이상인지 판별
        Predicate<Map.Entry<String, Integer>> highScore = new Predicate<Map.Entry<String, Integer>>() {
            @Override
            public boolean test(Map.Entry<String, Integer> entry) {
                return entry.getValue() >= 80;
            }
        };

        scores.entrySet().stream()
                .filter(highScore)
                .forEach(System.out::println);
                //.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
