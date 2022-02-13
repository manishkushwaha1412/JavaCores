package com.array.problem;

import java.util.Arrays;

public class CopyAnArray {

    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] copyArray = new int[10];

        for (int i=0; i< my_array.length; i++) {
            copyArray[i] = my_array[i];
        }
        System.out.println(Arrays.toString(copyArray));
    }
}
