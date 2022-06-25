package com.day3;

public class Student {
    String name;
    int roll;
    int marks;

    void displayStudentDetails(){
        System.out.println("Roll is:"+roll);
        System.out.println("Name is:"+name);
        System.out.println("Marks is:"+marks);
    }

    public static void main(String[] args) {
        Student rajesh = new Student();
        rajesh.name = "Rajesh";
        rajesh.roll = 305;
        rajesh.marks = 8;

        Student pritam = new Student();
        pritam.name = "Pritam";
        pritam.roll = 205;
        pritam.marks = 7;

        rajesh.displayStudentDetails();
        System.out.println("-----------------");

        pritam.displayStudentDetails();

        rajesh = null;
        pritam = null;
//        System.out.println(rajesh);
    }

}
