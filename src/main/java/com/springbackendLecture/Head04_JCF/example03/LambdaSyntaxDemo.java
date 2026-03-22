package com.springbackendLecture.Head04_JCF.example03;

public class LambdaSyntaxDemo {
    public static void main(String[] args) {
        // 단일 명령문
        Calculator add = (a, b) -> a + b;

        // 여러 줄 블룩
        Calculator subtract = (a, b) -> {
            System.out.println("subtracting...");
            return a - b;
        };

        System.out.println("3 + 5 = " + add.operate(3, 5));
        System.out.println("8 - 2 = " + subtract.operate(8, 2));
    }
}
