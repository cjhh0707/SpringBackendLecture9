package com.springbackendLecture.Head04_JCF.example02;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapNamesExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "carl");

        Function<String, String> nameUpper = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };

        names.stream()
                .map(nameUpper)
                .forEach(System.out::println);
    }
}
