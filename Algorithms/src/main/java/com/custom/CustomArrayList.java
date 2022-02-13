package com.custom;

public class CustomArrayList {

    // array list will use array of any data type, lets create this for String
    private String arrays[] = new String[10]; // 10 is default size
    private int size = 0;
    private boolean contains = false;

    private void add(String value){
        arrays[size] = value;
        size++;
        if(size == arrays.length){
            String newArray[] = new String[arrays.length * 2];
            for(int i=0; i<arrays.length; i++){
                newArray[i] = arrays[i];
            }
            arrays = newArray;
        }
    }

    public void remove(int index){
        if(index > 0 || index <= size){
            for(int i = index; i < size; i++){
                arrays[i] = arrays[i+1];
            }
            size--;
        }
    }

    public void remove(String value){
        int index = isValueInArray(value);
        this.remove(index);
    }

    private int isValueInArray(String value){
        int index = 0;
        for(int i=0; i < size; i++){
            if(arrays[i].equalsIgnoreCase(value)){
                index = i;
                break;
            }
        }
        return index;
    }

    public int size(){
        return arrays.length;
    }

    public String get(int index){
        return arrays[index];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean contains(String value){
        return this.isValueInArray(value) != 0;
    }

    public static void main(String[] args) {
        CustomArrayList customArrayList = new CustomArrayList();
        customArrayList.add("A");
        customArrayList.add("BB");
        /*for(int i =0; i <=100; i++){
            customArrayList.add("CustomValue-"+i);
        }*/
        System.out.println(customArrayList.contains("BB"));
        customArrayList.remove("BB");
        System.out.println(customArrayList.contains("BB"));
        System.out.println(customArrayList.size);
        for(int i= 0; i < customArrayList.size; i++){
            System.out.println(customArrayList.get(i));

        }
    }

}
