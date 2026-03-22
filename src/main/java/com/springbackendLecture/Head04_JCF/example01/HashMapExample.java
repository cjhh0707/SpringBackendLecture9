package com.springbackendLecture.Head04_JCF.example01;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        // 키 값 쌍 추가
        scores.put("Kim", 100);
        scores.put("Lee", 90);
        scores.put("Choi", 80);
        System.out.println(scores);

        //기존 키에 다른 값 할당
        scores.put("Lee", 70);
        System.out.println(scores);

        //특정 키의 값 조회
        int choiScore = scores.get("Choi");
        System.out.println(choiScore);

        //키 존재 여부
        System.out.println(scores.containsKey("Kim"));

        //요소 제거
        scores.remove("Kim");
        System.out.println(scores);

        //모든 키 조회
        System.out.println(scores.keySet());
    }
}
