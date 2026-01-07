package com.springbackendLecture.Head04_JCF.example01;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        //Array 예시
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        //ArrayList 예시
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.remove(Integer.valueOf(3));
        System.out.println(list);
    }
}
