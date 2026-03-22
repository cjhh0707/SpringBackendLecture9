package com.springbackendLecture.Head04_JCF.example04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("cat", "dog"),
                Arrays.asList("egg")
        );

        List<String> flattened = nestedList.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println(flattened);
    }
}
