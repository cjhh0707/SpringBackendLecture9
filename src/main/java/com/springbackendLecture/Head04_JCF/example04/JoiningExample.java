package com.springbackendLecture.Head04_JCF.example04;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "carl");

        String result = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
