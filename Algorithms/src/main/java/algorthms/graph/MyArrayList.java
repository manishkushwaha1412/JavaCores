package algorthms.graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MyArrayList {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        Map<String, String> stringStringMap = new HashMap<>();
        myArrayList.add("Manish");
        myArrayList.add("Kumar");
        myArrayList.add("Kumar1");
        myArrayList.add("Kumar2");
        myArrayList.remove(5);
      for(int i=0; i<myArrayList.size; i++){
          System.out.println(myArrayList.get(i));
      }
    }

    private String array[] = new String[10];
    private int size =0;

    public void add(String s){
        array[size] = s;
        size++;
        if(size == 10){
            String newArray[] = new String[array.length * 2];
            for(int i=0; i<array.length; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index){
        for(int i = index; i< size-1; i++){
            array[i] = array [i+1];
        }
        size --;
    }

    public int size(){
        return size;
    }

    public String get(int i){
        return array[i];
    }

}
