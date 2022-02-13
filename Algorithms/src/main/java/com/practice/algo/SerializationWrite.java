package com.practice.algo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationWrite {

    public static void main(String[] args) {

        try(FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/mkushwaha/Desktop/Res/latest/stu.ser")){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            Student student = new Student(1, "Manish");
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
            fileOutputStream.close();

        }catch (Exception e){

        }

    }

}
