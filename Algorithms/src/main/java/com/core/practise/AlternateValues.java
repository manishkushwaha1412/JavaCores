package com.core.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlternateValues {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Manish", "Kumar", "Singh", "Allahabad", "Delhi", "Bangalore");
        List<String> filteredNames = IntStream.range(0, names.size())
                .filter(o -> o % 2 == 0).mapToObj(names::get).collect(Collectors.toList());

        filteredNames.forEach(System.out::println);

    }


}
