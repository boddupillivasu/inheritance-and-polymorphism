package com.oopsfeatures.java;

public class StudentInfo {
    // instance variables

    String name;
    String mobileNum;
    String college;
    String department;

    // default constructor
    public StudentInfo() {
        System.out.println("it is  a default constructor");
    }
    // non argument constructor

    public  StudentInfo (String name, String mobileNum, String college, String department) {
        System.out.println("it is a non argument constructor");

        // instance variable = local variable
        this.name = name;
        this.mobileNum = mobileNum;
        this.college = college;
        this.department = department;

    }


    void basicInformation() {

        System.out.println("student name:" + name);
        System.out.println("student mobile num :" + mobileNum);
        System.out.println("student college:" + college);
        System.out.println("student branch:" + department);



    }


    }




