package com.practice.algo;

import java.util.Arrays;

public class QuickSort {

    /*quick sort algorithm is based on divide and conquer where actually problem will be divided in sub problem and
    then conquer and again divide the same. This process we have to repeat to most granular level where actually problem will be divided in
    in small problem where it cannot break down.*/

    /*How to implement - take two point low and high. low at left. We need to take pivot value and it can be any value lets
    say low number is the pivot value. now love low number to right and only stop if low value is greater than pivot. And move right to left and only stop if
    high value is less than pivot. If we do so then lower value wil be at left and higher values will be at right.
    While doing this if low and high value stop at a point then swap these values and this becomes our first iteration.
    we need to repeat the same until array is not sorted
    * */

    public static void main(String[] args) {
        Integer[] array = new Integer[]{84, 10, 5, 33, 56, 89, 9, 99};
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));

    }

    private static void quickSort(Integer[] array, int low, int high){

        if(low > high) return;

        // get the pivot value
        int pivot = array[low];

        int i = low;
        int j = high;
        // start low movement from left to right only if it is greater than pivot
        while(i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                // swap this value
                swap(array, i, j);
                i++;
                j--;
            }

            // repeat this if i is less than high and low is less than j
            if (low < j) {
                quickSort(array, low, j);
            }
            if (i < high) {
                quickSort(array, i, high);
            }
        }
    }

    private static void swap(Integer[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
