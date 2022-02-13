package com.equals.and.hash;

public class Test {

    public static void main(String[] args) {
        Student student = new Student(1, "Manish");
        Student student1 = new Student(1, "Manish");

        System.out.println("Shallow Comparison: "   + (student==student1));
        System.out.println("Deep Comparison: "   + (student.equals(student1)));
    }
}
