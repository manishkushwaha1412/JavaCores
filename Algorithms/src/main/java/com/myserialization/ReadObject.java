package com.myserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("D:/Manish/Algorithms/obj.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object newObject = objectInputStream.readObject();
            if(newObject instanceof Student){
                Student student = (Student) newObject;
                System.out.println(student);
            }
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}
