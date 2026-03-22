package com.springbackendLecture.Head04_JCF.example01;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        //요소 추가
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits);

        //인덱스를 통한 접근
        String firstFruit = fruits.get(0);
        System.out.println(firstFruit);

        //요소삭제
        fruits.remove(1);
        System.out.println(fruits);

        //개수 확인
        System.out.println(fruits.size());

        //전체제거
        fruits.clear();
        System.out.println(fruits);
    }
}
