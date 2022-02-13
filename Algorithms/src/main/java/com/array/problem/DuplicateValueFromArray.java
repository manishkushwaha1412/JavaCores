package com.array.problem;

import java.util.Arrays;
import java.util.List;

public class DuplicateValueFromArray {

    public static void main(String[] args) {
        Integer[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        List<Integer> integerList = Arrays.asList(my_array);

        Integer[] aa = (Integer[]) integerList.toArray();
        System.out.println(Arrays.toString(aa));

        int position = 0;
        int newValue = 5;

        for (int i = 0; i < my_array.length; i++) {


        }

    }
}
