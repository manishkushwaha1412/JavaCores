package com.core.practise;

public class SingletonPatternTest {

    public static void main(String[] args) {
        SingletonPattern singletonPattern = SingletonPattern.getSingletonPattern();
        SingletonPattern singletonPattern1 = SingletonPattern.getSingletonPattern();
        System.out.println("Is equals == "+(singletonPattern == singletonPattern1));
    }
}
