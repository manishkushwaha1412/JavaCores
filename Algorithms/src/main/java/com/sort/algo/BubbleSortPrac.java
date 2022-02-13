package com.sort.algo;

import java.util.Arrays;

public class BubbleSortPrac {

    public static void main(String[] args) {
        Integer array[] = new Integer[]{1, 3, 2, 6, 8, 9, 4, 7, 2};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    private static void bubbleSort(Integer[] integers) {

        for (int i = 0; i < integers.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < integers.length - i - 1; j++) {

                if (integers[j + 1] < integers[j]) {
                    swapped = true;
                    swap(integers, j + 1, j);
                }
            }
            if(!swapped){
                break;
            }
        }

    }

    private static void swap(Integer[] array, int low, int high) {
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;

    }
}
