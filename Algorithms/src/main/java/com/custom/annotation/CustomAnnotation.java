package com.custom.annotation;

public class CustomAnnotation {

    public static void main(String[] args) {

        @Author(first = "", last = "")
        Book book = new Book();
    }
}

class Book{

}