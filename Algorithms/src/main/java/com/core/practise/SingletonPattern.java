package com.core.practise;

public class SingletonPattern {

    private static SingletonPattern singletonPattern = null;

    private SingletonPattern(){
        System.out.println("This will be called only once.....");
    }

    public static SingletonPattern getSingletonPattern(){
        if(singletonPattern == null){
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }


}
