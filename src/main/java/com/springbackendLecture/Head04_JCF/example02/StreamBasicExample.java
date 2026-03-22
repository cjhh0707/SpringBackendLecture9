package com.springbackendLecture.Head04_JCF.example02;
import java.util.Arrays;
import java.util.List;

public class StreamBasicExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Jerry", "Kim", "Tommy");

        names.stream() //Stream 생성
                .filter(name -> name.startsWith("T")) //중간연산
                .map(String::toLowerCase)   //중간연산2
                .forEach(System.out::println);  //최종연산
    }
}
