package com.oopsfeatures.java;
/*
here  we create another class and also using extends keyword
by inheritance purpose
it is the sub/child class for student info
 */
public class LetStudent extends StudentInfo{

    String specification;

    public LetStudent(){
        System.out.println("it is  a let student default constructor");

    }

    public LetStudent(String name, String mobileNum, String college, String department, String specification) {
        super(name, mobileNum, college, department);
        this.specification = specification;
    }
    void basicInformation(){
        super.basicInformation();
        System.out.println("the let student specification:" + specification);
    }
}
