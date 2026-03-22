package com.springbackendLecture.Head04_JCF.example02;
import java.util.HashMap;
import java.util.Map;

public class EntrySetBasicExample {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Japan", "Tokyo");
        capitals.put("Korea", "Seoul");
        capitals.put("China", "Beijing");

        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
