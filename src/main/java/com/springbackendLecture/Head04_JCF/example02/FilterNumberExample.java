package com.springbackendLecture.Head04_JCF.example02;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterNumberExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //익명 클래스를 사용한 Predicate
        Predicate<Integer> isEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        };

        Stream<Integer> stream = numbers.stream();
        Stream<Integer> evenStream = stream.filter(isEven); //filter의 중간 연산

        //evenStream.forEach(num -> System.out.println(num)); //최종연산
        evenStream.forEach(System.out::println);
    }
}
