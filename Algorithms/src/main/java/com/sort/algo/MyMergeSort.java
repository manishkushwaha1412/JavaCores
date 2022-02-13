package com.sort.algo;

import java.util.Arrays;

public class MyMergeSort {

    public static void main(String[] args) {
        Integer array[] = new Integer[]{35, 50, 15, 25, 80, 20, 90, 45};
        mergeSort(array);
        //System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(Integer[] array) {

        if (array.length <= 1) {
            return ;
        }
        int length = array.length;
        int l = length-length/2;
        Integer[] part1 = Arrays.copyOfRange(array, 0, length/2);
        Integer[] part2 = Arrays.copyOfRange(array, length-length/2, length);
        System.out.println(Arrays.toString(part1));
        System.out.println(Arrays.toString(part2));
        mergeSort(part1);
        mergeSort(part2);

        mergeArray(part1, part2, array);

    }

    private static void mergeArray(Integer[] first, Integer[] second, Integer[] result){

    }

}
