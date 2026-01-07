package com.springbackendLecture.Head03_OOP.example13;

public class LambdaDemo {
    public static void main(String[] args) {
        //익명 클래스 방식
        MyCalculator addAnon = new MyCalculator() {
            @Override
            public int operate(int x, int y) {
                return x + y;
            }
        };
        System.out.println(addAnon.operate(1, 2));

        //람다식 방식
        MyCalculator addLambda = (x, y) -> x * y;
        System.out.println(addLambda.operate(3, 4));
    }
}
