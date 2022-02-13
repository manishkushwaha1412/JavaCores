package com.algo.test.sort;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{5, 10, 19, 3, 4, 17, 2, 30, 22};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(Integer[] array) {
        // split array into part
        if (array.length <= 1) return;
        int length = array.length;
        Integer[] one = Arrays.copyOfRange(array, 0, length / 2);
        Integer[] two = Arrays.copyOfRange(array, length - length / 2, length);

        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));

        mergeSort(one);
        mergeSort(two);
        merge(one, two, array);
    }

    private static void merge(Integer[] first, Integer[] second, Integer[] array){

        int f = 0; int s=0; int ar = 0;
        while(f < first.length && s < second.length){
            if(first[f].compareTo(second[s]) < 0){//
                array[ar] = first[f];
                f++;
            }else{
                array[ar] = second[s];
                s++;
            }
            ar++;
        }

        System.arraycopy(first, f, array, ar, first.length-f);
        System.arraycopy(second, s, array, ar, second.length-s);


    }
}
