package com.array.problem;

import java.util.*;
import java.util.stream.Collectors;

public class LinkedListAppend {

    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList();
        LinkedList<String> l_list1 = new LinkedList();
        LinkedList<String> vall = new LinkedList<>();
        List<String> al = new ArrayList<>(l_list);
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");

        l_list1.add("A");
        l_list1.add("G");
        l_list1.add("B");
        l_list1.add("W");
        l_list1.add("P");
        l_list1.add("Y");

        System.out.println(l_list);
        l_list.forEach(System.out::println);
        //l_list.add(3, "xyz");
        System.out.println("-------------------------------");


        // Swap
        Collections.swap(l_list, 2, 3);
        l_list.forEach(System.out::println);
        /*ListIterator listIterator = l_list.listIterator(1);
        vall.listIterator(2);// this can be applicable on any collection
        while(listIterator.hasNext()){
            String val = (String) listIterator.next();
            System.out.println(val);
        }*/

    }
}
