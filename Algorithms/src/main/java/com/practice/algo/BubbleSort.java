package com.practice.algo;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{84, 10, 5, 33, 56, 89, 9, 99, 66};
        System.out.println(Arrays.toString(array));

        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(Integer[] array){

        for (int i = 0; i < array.length ; i++) {

            boolean swapped = false;
            for (int j = 0; j < array.length-i-1 ; j++) {

                if(array[j+1] < array [j]){
                    swapped = true;
                    swap(array, j+1, j);
                }
            }
            if(!swapped){
                break;
            }
        }

    }

    private static void swap(Integer[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
