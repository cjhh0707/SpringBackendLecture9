package com.springbackendLecture.Head05_STRUCTURE.example02;

public class GenericMethodExample {
    public static <U extends Comparable<U>> U max(U x, U y) {
        if (x.compareTo(y) >= 0) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(10, 20));
        System.out.println(max("apple", "pear"));
    }
}
