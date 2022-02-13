package com.practice.algo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysToCreateObject {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, CloneNotSupportedException {

        // 1. New Key work
        Student stu = new Student(1, "A");

        // 2. new Instance
         Student student = Student.class.newInstance();

         // 3. Class Get Constructor
         Constructor<Student> stuCon =  Student.class.getConstructor();
         Student stt =  stuCon.newInstance();

        // 4. Class.forName
        Class aClass =  Class.forName("com.practice.algo.Student");
         Student ss = (Student) aClass.getConstructor().newInstance();

         // 5. Clone
         Student clone =  (Student) student.clone();

         // 6. Deserialize with OutjectInputStream.readObject

    }
}
