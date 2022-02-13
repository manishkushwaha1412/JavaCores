package com.array.problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ReverseArray {

    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        int[] my_array2 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        System.out.println("Check if Array is equal");
        System.out.println(Arrays.equals(my_array1, my_array2));
        int[] reversed = new int[my_array1.length];
        int size = my_array1.length-1;
        for (int i = 0; i < my_array1.length ; i++) {
            reversed[size] = my_array1[i] ;
            size--;
        }
        Arrays.sort(my_array1);
        System.out.println("Min "+my_array1[0]);
        System.out.println("Max "+my_array1[my_array1.length-1]);
        System.out.println(Arrays.toString(reversed));

        System.out.println("Find Duplicate");
        List<Integer> integers = Arrays.stream(my_array1).boxed().collect(Collectors.toList());
        Set<Integer> integerSet = new HashSet<>();
        integers.stream().filter(i-> !integerSet.add(i)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Check if Array is equal");
        System.out.println(Arrays.equals(my_array1, my_array2));

    }
}
