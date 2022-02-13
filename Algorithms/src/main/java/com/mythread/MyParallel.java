package com.mythread;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyParallel {

    public static void main(String[] args) {
        int processors =  Runtime.getRuntime().availableProcessors();
        System.out.println(processors);
        List<Integer> integerList = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());
        long start = System.currentTimeMillis();
        printStream(integerList.stream());
        long end = System.currentTimeMillis();
        System.out.println("Total Time : "+(end-start)/1000);
    }

    public static void printStream(Stream<Integer> sI){

       sI.forEach(s->{
           System.out.println("Thread name "+s+" : "+Thread.currentThread().getName());
           try{
               Thread.sleep(500);
           }catch (Exception e){

           }
       });


    }
}
