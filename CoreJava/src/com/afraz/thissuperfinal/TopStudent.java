/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.thissuperfinal;

/**
 *
 * @author syeda
 */
public class TopStudent extends Student{
    
//    public void study(){
//        
//    }

    public TopStudent() {
        super();//super call
        System.out.println("Default cons from TopStudent");
    }
    
    
      public void studyFirst(){
          super.study();
         // studentMarks=56;
          System.out.println("printing variable::"+super.studentMarks);
        System.out.println("studing first...");
    }
      
      public static void main(String[] args) {
        TopStudent topstu=new TopStudent();
        topstu.studyFirst();
    }
    
    
}
