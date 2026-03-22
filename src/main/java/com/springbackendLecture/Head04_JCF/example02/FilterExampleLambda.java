package com.springbackendLecture.Head04_JCF.example02;
import java.util.ArrayList;
import java.util.List;

public class FilterExampleLambda {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //람다 표현식으로 Predicate 구현
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.println(number));
    }
}
