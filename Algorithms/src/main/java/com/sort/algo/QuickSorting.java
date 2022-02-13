package com.sort.algo;

import java.util.Arrays;

public class QuickSorting {



    public static void main(String[] args) {
        Integer[] array = new Integer[]{35, 20, 15, 85, 40, 50, 90};
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(Integer[] array, int low, int high) {
        if (low > high) {
            return;
        }

        int i = low;
        int j = high;
        int middle = low + (high-low)/2;
        int pivot = array[middle];

        while (i <= j) {
            // calculate pivot

            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                // swap()
                swap(array, i, j);
                i++;
                j--;
            }

            if (low < i) {
                quickSort(array, low, j);
            }
            if (high > j) {
                quickSort(array, i, high);
            }
        }
    }

    private static void swap(Integer[] array, int low, int high) {
        int val = array[low];
        array[low] = array[high];
        array[high] = val;
    }
}
