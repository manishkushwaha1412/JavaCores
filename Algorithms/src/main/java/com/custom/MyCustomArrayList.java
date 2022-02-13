package com.custom;

import java.util.Arrays;

public class MyCustomArrayList {

    private int defaultSize = 10;

    private int size = 0;

    String[] array = new String[defaultSize];

    public void add(String value) {
        array[size] = value;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray; // assigning new array variable back to old
        }
    }

    public String get(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }

    public void remove(int index) {
       if(index < array.length || index > 0){
           for(int i = index; i < size; i++){
               array[i] = array[i+1];
           }
           size --;
       }
    }

    public void remove(String value){
        if(value != null){
            int index=0;
            for (int i = 0; i < array.length; i++) {
                if (value.equalsIgnoreCase(array[i])) {
                    index = i;
                    break;
                }
            }
            remove(index);
        }
    }

    public boolean contains(String value) {
        if (value == null) return false;
        for (int i = 0; i < array.length; i++) {
            if (value.equalsIgnoreCase(array[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        MyCustomArrayList myCustomArrayList = new MyCustomArrayList();
        for (int i = 0; i <= 10; i++) {

            myCustomArrayList.add("A" + i);
        }
        System.out.println(myCustomArrayList);
        System.out.println(myCustomArrayList.size);
        System.out.println(myCustomArrayList.get(3));
        System.out.println(myCustomArrayList.contains("null"));
        myCustomArrayList.remove(3);
        myCustomArrayList.remove("A4");
        System.out.println(myCustomArrayList);

    }

    @Override
    public String toString() {
        return "MyCustomArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
