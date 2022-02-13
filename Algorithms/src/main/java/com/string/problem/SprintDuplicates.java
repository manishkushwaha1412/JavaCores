package com.string.problem;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SprintDuplicates {

    public static void main(String[] args) {
        String value = "Hello Frineds my name is Manish ";
        SprintDuplicates sprintDuplicates = new SprintDuplicates();
        sprintDuplicates.printDuplicate(value.replaceAll("\\s", ""));
    }

    public void printDuplicate(String value){
        char[] chars = value.toCharArray();
        Map<String, Integer> duplicated = new HashMap<String, Integer>();
        for (int i = 0; i < chars.length ; i++) {
            if(duplicated.containsKey(String.valueOf(chars[i]))){
                duplicated.put(String.valueOf(chars[i]), duplicated.get(String.valueOf(chars[i]))+1);
            }else{
                duplicated.put(String.valueOf(chars[i]), 1);
            }
        }

        System.out.println("counting now" );
         duplicated.entrySet().stream().filter(a->a.getValue()>1).collect(Collectors.toList()).forEach(System.out::println);


        System.out.println(duplicated);

    }

}
