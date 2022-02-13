package com.space.dtl;

public class GetMemoryDetails {

    public static void main(String[] args) {
        int megaByte = 1024*1024;
        Runtime runtime = Runtime.getRuntime();

        long free = runtime.freeMemory();
        long freeMemory = free/megaByte;
        System.out.println("Total Free Memory:   "+freeMemory);

        long totalmemory = runtime.totalMemory();
        System.out.println("Total Memory:   "+totalmemory/megaByte);

        System.out.println("Used Memory:   "+(totalmemory-freeMemory)/megaByte);

        System.out.println("Max Memory "+runtime.maxMemory()/megaByte);

    }
}
