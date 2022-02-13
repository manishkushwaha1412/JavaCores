package com.sort.algo;

import java.util.Arrays;

public class MyQuickSort {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{35, 50, 40, 15, 25, 20, 90};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    private static void quickSort(Integer[] array, int low, int high) {
        if (low > high) {
            return;
        }
        // identify pivot
        int middle = (high + low) / 2;
       // System.out.println("middle number is " + middle);
        int pivot = array[middle];
        //System.out.println("Pivot is " + pivot);

        int i = low;
        int j = high;

        // start moving right to left
        while (i < j) {
            while(array[i] < pivot){
                i++;
            }
            while(array[j] > pivot){
                j--;
            }
            if(i <= j){
                //swap it
                swap(array, i, j);
                i++;
                j--;
            }

            if(low < j){
                quickSort(array, low, j);
            }
            if(high > i){
                quickSort(array, i, high);
            }
        }

    }

    private static void swap(Integer[] array, int i, int j){
        Integer lowV = array[i];
        array[i]  = array[j];
        array[j] = lowV;

    }
}
