package com.sort.algo;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        Integer array[] = new Integer[]{1, 3, 2, 6, 8, 9, 4, 7, 2};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));


    }

    private static void bubbleSort(Integer[] array){

        for (int i = 0; i < array.length-1 ; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length-i-1 ; j++) {

                if(array[j+1] < array[j]){
                    flag = true;
                    swap(array, j+1, j);
                }
            }
            if(!flag) break;
        }
    }

    private static void swap(Integer[] array, int low, int high){
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
    }
}
