package com.myserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteFile {

    public static void main(String[] args) {
        // Create object first
        Student student = new Student("Manish", "manish@hh.com", 1234L, 1000.00D, 123, "123456789");
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("D:/Manish/Algorithms/obj.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Object has been written ");

        }catch(Exception e){
            e.printStackTrace();

        }
    }

}
