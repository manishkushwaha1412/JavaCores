package com.practice.algo;

import java.util.*;

public class StudentCompare {

    public static void main(String[] args) {
        Student student = new Student(1, "B");
        Student student1 = new Student(1, "A");
        Student student2 = new Student(1, "C");
        Student student3 = new Student(1, "F");

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        //students.sort((s1, s2)-> s1.getName().compareTo(s2.getName()));
        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println(students);

    }
}
