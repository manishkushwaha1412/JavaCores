package com.myserialization;

public class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("Manish", "manish@hh.com", 1234L, 1000.00D, 123, "123456789");
        Student clone = (Student) student.clone();
        if(student==clone){
            System.out.println("Address is same ");
        }else{
            System.out.println("Address is Different ");
        }
        if(student.equals(clone))  System.out.println("Content is same ");
        System.out.println(student);
        System.out.println(clone);
        student.setName("Manish1");
        System.out.println(student);
        System.out.println(clone);
        clone.setName("2");
        System.out.println(clone);
        System.out.println(student);
    }


}
