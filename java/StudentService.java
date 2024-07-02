package com.oopsfeatures.java;

public class StudentService {
    /*
    runtime polymorphism we can pass different parameters no need to compile time polymorphism
     */
    // runtime time polymorphism and method overloading

    public StudentService(StudentInfo student, StudentInfo studentInfo) {

    }
    // compile time polymorphism

    public StudentService(RegStudent regStudent) {

    }

}
