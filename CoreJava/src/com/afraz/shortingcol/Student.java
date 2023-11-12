/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.shortingcol;

/**
 *
 * @author syeda
 */
public class Student implements Comparable<Student>{
  
int stuId;
String stuName;
int stuAge;

    public Student(int stuId, String stuName, int stuAge) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    @Override
    public int compareTo(Student obj) {
     if(stuAge==obj.stuAge){
         return 0;
     }else if(stuAge>obj.stuAge){
       return 1;
     }
     else{
         return -1;
     }
    }
    
    


}
