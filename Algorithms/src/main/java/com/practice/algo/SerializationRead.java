package com.practice.algo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializationRead {

    public static void main(String[] args) {

        try(FileInputStream fileInputStream = new FileInputStream("C:/Users/mkushwaha/Desktop/Res/latest/stu.ser");){
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object o = objectInputStream.readObject();
            if(o instanceof Student){
                Student stu = (Student) o;
                System.out.println(stu);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
