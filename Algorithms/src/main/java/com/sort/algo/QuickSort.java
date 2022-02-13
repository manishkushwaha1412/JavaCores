package com.sort.algo;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        Integer array[] = new Integer[]{35, 50, 15, 25, 80, 20, 90, 45};
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));

    }

    // low will be 0 and high will be length-1
    public static void quickSort(Integer[] array, int low, int high){
        if(low > high){
            return;
        }

        int middle = low + (high-low)/2;
        int pivot = array[middle];
        int i = low, j = high;
        while(i <= j){
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

    public static void swap(Integer array[], int x, int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
