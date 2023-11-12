/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.constructor;


public class Student {
    public int stuID;
    public int studentMarks;
    public String studentName;
    int a=7;

    public Student() {
        //this is default constructor
        System.out.println("Default constructor");
    }

    public Student(int stuID) {
        this.stuID = stuID;
        System.out.println(this.a);
    }

    public Student(int stuID, int studentMarks) {
        this.stuID = stuID;
        this.studentMarks = studentMarks;
        System.out.println("This parametrized constructor");
        System.out.println("Student ID::"+stuID);
         System.out.println("Student Marks::"+studentMarks);
    }

    
    public Student(int stuID, int studentMarks, String studentName) {
        this.stuID = stuID;
        this.studentMarks = studentMarks;
        this.studentName = studentName;
        System.out.println("This parametrized constructor");
        System.out.println("Student ID::"+stuID);
         System.out.println("Student Marks::"+studentMarks);
          System.out.println("Student NAme::"+studentName);
    }
    
    
    public static void main(String[] args) {
        Student stu=new Student(12, 450);
        
    }
    
    
}
