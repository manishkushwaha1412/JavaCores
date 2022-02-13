package com.algo.test.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{5, 10, 19, 3, 4, 17, 2, 30, 22};
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));

    }

    private static void quickSort(Integer[] array, int low, int high){

        // check if low is more than high then return
        if(low > high) return ;

        // get the pivot value lets take low is the pivot value
        int pivot = array[low];

        // initialize variable for loop

        int i = low;
        int j = high;
        while (i <= j){
            // start from left to write if pivot value is greater than pivot value
            while(array[i] < pivot){
                i++;
            }
            while(array[j] > pivot){
                j--;
            }
            if(i <= j){
                swap(array, i, j);
                i++;
                j--;
            }
            System.out.println(array);
            if(low < j) {
                quickSort(array, low, j);
            }
            if(high > i){
                quickSort(array, i, high);
            }

        }

    }

    private static void swap(Integer[] array, int low, int high){
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
    }

}
