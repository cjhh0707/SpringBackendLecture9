package com.springbackendLecture.Head04_JCF.example05;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinAndMaxByExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "banana");

        Optional<String> minFruits = fruits.stream()
                .collect(Collectors.minBy(Comparator.naturalOrder()));
        Optional<String> maxFruits = fruits.stream()
                .collect(Collectors.maxBy(Comparator.naturalOrder()));

        System.out.println(minFruits.orElse("None"));
        System.out.println(maxFruits.orElse("None"));
    }
}
