package com.oopsfeatures.java;

public class Main {
    public static void main(String[] args) {

        /*
        here we declare different objects it can access Studentinfo details
         */

        StudentInfo studentInfo;
        studentInfo = new StudentInfo();//it show's default constructor
        studentInfo.basicInformation();//it show's default values of studentinfo because of it is instance variables


        StudentInfo student;
        student = new StudentInfo("rishi", "9666462662", "nri", "ece");
        student.basicInformation();// it displays non argument constructor

        RegStudent regStudent1;
        regStudent1 = new RegStudent();//it show's default constructor
        regStudent1.basicInformation();//it show's default values of studentinfo because of it is instance variables

        RegStudent regStudent;
        regStudent = new RegStudent("bharath", "9398180481", "vvit", "cse", 85);
        regStudent.basicInformation();// it displays non argument constructor


        LetStudent letStudent;
        letStudent = new LetStudent();//it show's default constructor
        letStudent.basicInformation();//it show's default values of studentinfo because of it is instance variables

        LetStudent letStudent1;
        letStudent1 = new LetStudent("manohar", "8639836639", "rvr", "civil", "batchelor of technology");
        letStudent1.basicInformation();// it displays non argument constructor

        // method overloading

        // runtime polymorphism
        StudentService methodOverloading;
        methodOverloading = new StudentService(student, studentInfo);

        // compile time polymorphism
        StudentService studentService;
        studentService = new StudentService(regStudent);

    }

}
