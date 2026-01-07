package com.springbackendLecture.Head02_JavaProgramming;

public class OperatorExample {
    public static void main(String[] args) {
//        int a = 15, b = 4;
//        System.out.println("덧셈: " + (a + b));
//        System.out.println("뺄셈: " + (a - b));
//        System.out.println("곱셈: " + (a * b));
//        System.out.println("나눗셈(정수): " + (a / b));
//        System.out.println("나눗셈(실수): " + ((double) a / b));
//        System.out.println("나머지: " + (a % b));
        int celsius = 25;
        double Fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273.15;

        System.out.println("섭씨: " + celsius);
        System.out.println("화씨: " + Fahrenheit);
        System.out.println("켈빈: " + kelvin);
    }
}
