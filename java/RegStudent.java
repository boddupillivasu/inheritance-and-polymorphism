package com.oopsfeatures.java;
/*
here  we create another class and also using extends keyword
by inheritance purpose
it is the sub/child class for student info
 */
public class RegStudent extends StudentInfo {
   public int avgPercentage;

    public RegStudent() {

        System.out.println("it is a reg student default constructor ");
    }

    public RegStudent(String name, String mobileNum, String college, String department, int avgPercentage) {
        super(name, mobileNum, college, department);
        this.avgPercentage = avgPercentage;
    }
    //method overriding because same method name is used

      void basicInformation(){
        super.basicInformation();
        System.out.println("the student percentage:" + avgPercentage);
    }
}
