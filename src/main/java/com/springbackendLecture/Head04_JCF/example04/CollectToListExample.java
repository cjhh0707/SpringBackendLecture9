package com.springbackendLecture.Head04_JCF.example04;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToListExample {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("a", "b", "c", "c", "e");

        List<String> result = data.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
