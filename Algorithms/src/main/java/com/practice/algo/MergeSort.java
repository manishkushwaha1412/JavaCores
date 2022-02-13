package com.practice.algo;

import java.util.Arrays;

public class MergeSort {

    /*
    This is also divide and conquer technique where problem will be divided into sub problem and one situation will come where
    we can not divide further more. At this point each array will be divided on single digit and now we need to compare it one by one and
    if left hand number is greater than right land then we need to swap it and merge the same.
    This process we need to repeat unless sub problem is not merged to complete array
    Once array is formed, then we can see it sorted Array.
     */

    public static void main(String[] args) {
        Integer[] array = new Integer[]{84, 10, 5, 33, 56, 89, 9, 99, 66};
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(Integer[] array){
        // split array into two parts first
        if(array.length <= 1) return;
        int length = array.length;
        int halfle = length - length/2;
        if(length % 2 == 0){
            halfle = length - ((1+length) /2);
        }
        //System.out.println(halfle);
        //System.out.println(length-length/2);
        Integer[]  first = Arrays.copyOfRange(array, 0, halfle);
        Integer[]  second = Arrays.copyOfRange(array, length-length/2, length);

        // print array
        //System.out.println(Arrays.toString(first));
        //System.out.println(Arrays.toString(second));

        mergeSort(first);
        mergeSort(second);
        sortAndMerge(first, second, array);
    }

    private static void sortAndMerge(Integer[] first, Integer[] second, Integer[] array){
        int f = 0;
        int s = 0;
        int ar = 0;
        while (f < first.length && s < second.length){
            if(first[f].compareTo(second[s]) < 0){
                array[ar] = first[f];
                f++;
            }else{
                array[ar] = second[s];
                s++;
            }
            ar++;
        }
        System.arraycopy(first, f, array, ar, first.length-f);
        System.arraycopy(second, s, array, ar, second.length-s);

    }
}
