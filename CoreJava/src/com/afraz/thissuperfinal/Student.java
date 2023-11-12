package com.afraz.thissuperfinal;

/**
 *
 * @author syeda
 */
 public class Student {
    int stuId;
    String stuName;
    String stuAddress;
    
   final int studentMarks=23;

    public Student() {
        System.out.println("student ::default constructor");
    }
    
    
   final public void study(){
        System.out.println("studing...");
    }
    
      public void test(){
        System.out.println("studing...");
    }
    
    
}
