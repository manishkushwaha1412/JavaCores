package com.sort.algo;

import java.util.Arrays;

public class QuickSortPrac {

    public static void main(String[] args) {
        Integer array[] = new Integer[]{1, 3, 2, 6, 8, 9, 4, 7, 2};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(Integer[] array, int low, int high) {
        if (low > high) return;

        int pivot = array[low];

        int i = low;
        int j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }

            // do recursive call for splitted arrays
            if (low < j) {
                quickSort(array, low, j);
            }

            if (high > i) {
                quickSort(array, i, high);
            }
        }
    }

    private static void swap(Integer[] array, int low, int high) {
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;

    }

}
