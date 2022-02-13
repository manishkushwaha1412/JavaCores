package com.algo.test.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{5, 10, 19, 3, 4, 17, 2, 30, 22};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(Integer[] array) {

        for (int i = 0; i < array.length; i++) {

            boolean flagged = false;
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j + 1] < array[j]) {
                    flagged = true;
                    swap(array, j + 1, j);
                }

            }
            if (!flagged) {
                return;
            }

        }

    }

    private static void swap(Integer[] array, int low, int high) {
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
    }
}
