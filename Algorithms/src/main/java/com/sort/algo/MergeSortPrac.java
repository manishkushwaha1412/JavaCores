package com.sort.algo;

import java.util.Arrays;
import java.util.Collections;

public class MergeSortPrac {

    public static void main(String[] args) {
        //Integer array[] = new Integer[]{1, 3, 2, 6, 8, 9, 4, 7, 2};
        Integer array[] = new Integer[]{35, 50, 15, 25, 80, 20, 90, 45};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(Integer[] arrays){

        if(arrays.length <= 1) return;
        // split this array into multiple parts
        int arrLength = arrays.length;

        Integer[] part1 = Arrays.copyOfRange(arrays, 0, arrLength/2);
        Integer[] part2 = Arrays.copyOfRange(arrays, arrLength-arrLength/2, arrLength);
        System.out.println(Arrays.toString(part1));
        System.out.println(Arrays.toString(part2));

        mergeSort(part1);
        mergeSort(part2);

        merge(part1, part2, arrays);


    }

    private static void merge(Integer[] part1, Integer[] part2, Integer[] array){
        int part1I = 0; int part2I = 0; int arrayI = 0;
        while(part1I < part1.length && part2I < part2.length){
           if(part1[part1I].compareTo(part2[part2I]) < 0){
               array[arrayI] = part1 [part1I];
              part1I++;
           }else{
               array[arrayI] = part2 [part2I];
               part2I++;
           }
           arrayI++;
        }
       System.arraycopy(part1, part1I, array, arrayI, part1.length-part1I);
       System.arraycopy(part2, part2I, array, arrayI, part2.length-part2I);
    }
}
