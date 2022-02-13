package com.sort.algo;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        Integer array[] = new Integer[]{35, 50, 15, 25, 80, 20, 90, 45};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static Comparable[] mergeSort(Comparable[] arrays){
        if(arrays.length <= 1){
            return arrays;
        }
        Comparable first[] = new Comparable[arrays.length/2];
        Comparable second[] = new Comparable[arrays.length -first.length];
        System.arraycopy(arrays, 0, first, 0, first.length);
        System.arraycopy(arrays, first.length, second, 0, second.length);
        System.out.println(Arrays.toString(second));
        System.out.println(Arrays.toString(first));

        // call recursive to copy array again
        mergeSort(first);
        mergeSort(second);

        // now merge array again
        merge(first, second, arrays);

        return arrays;

    }

    private static void merge(Comparable[] first, Comparable[] second, Comparable[] result){
        int firstI = 0; int secondI =0; int resultI =0;
        while(firstI < first.length && secondI < second.length){
            if(first[firstI].compareTo(second[secondI]) < 0){
                result[resultI] = first[firstI];
                firstI++;
            }else{
                result[resultI] = second[secondI];
                secondI++;
            }
            resultI++;
        }
        System.arraycopy(first, firstI, result, resultI, first.length-firstI);
        System.arraycopy(second, secondI, result, resultI, second.length-secondI);
    }
}
