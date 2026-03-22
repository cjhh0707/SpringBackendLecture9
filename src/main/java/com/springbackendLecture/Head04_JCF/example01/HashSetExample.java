package com.springbackendLecture.Head04_JCF.example01;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();

        //요소 추가
        countries.add("Korea");
        countries.add("China");
        countries.add("Germany");
        countries.add("Korea"); //중복된 요소는 추가로 저장x

        System.out.println(countries);

        System.out.println(countries.contains("China"));    //true or false

        countries.remove("China");  //요소 삭제
        System.out.println(countries);

        System.out.println(countries.size());   //개수

        countries.clear();  //전체 제거
        System.out.println(countries);
    }
}
