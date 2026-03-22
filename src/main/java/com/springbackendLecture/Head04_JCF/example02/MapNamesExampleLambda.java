package com.springbackendLecture.Head04_JCF.example02;
import java.util.Arrays;
import java.util.List;

public class MapNamesExampleLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "carl");

        names.stream()
                .map(s -> s.length())
                .forEach(System.out::println);
    }
}
