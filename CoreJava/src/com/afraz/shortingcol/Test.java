/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.shortingcol;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author syeda
 */
public class Test {
    
    public static void main(String[] args) {
        ArrayList<Student> alist=new ArrayList();
        
        alist.add(new Student(1, "Raj", 12));
        alist.add(new Student(2, "Abhi", 14));
        alist.add(new Student(3, "Afraz", 13));
        alist.add(new Student(4, "Riya", 52));
        alist.add(new Student(5, "Ranjan", 32));
        Collections.sort(alist);
        
        for (Student alist1 : alist) {
            System.out.println(alist1.stuId+"    "+alist1.stuName+"    "+alist1.stuAge);
        }
    }
    
}
