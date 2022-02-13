package com.array.problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListRemoveDuplicate {

    public static void main(String[] args) {
        Integer[] integer  = {1, 5, 4, 6, 8, 9, 2, 4, 6};
        Integer[] duplicate = new Integer[integer.length];

        List<Integer> integerList = Arrays.asList(integer);



        Set<Integer> dup = new HashSet<>(integerList);
        Integer[] duplicates = dup.stream().toArray(Integer[]::new);

        System.out.println(Arrays.toString(duplicates));


       // System.out.println(integerList.stream().filter(i->!dup.add(i)).collect(Collectors.toList()));
    }

}
