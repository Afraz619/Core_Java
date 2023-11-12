/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.encapsulationdemo;

import com.afraz.methods.HelloMethod;

/**
 *
 * @author syeda
 */
public class TestEmployee {
    
    //block in java
    
    static{
        System.out.println("Hello from blocks");
    }
    {
        System.out.println("hello non static");
    }
    
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setEmpId(12);
        emp.setEmpName("Afraz");
        emp.setEmpAddress("Hyd");
        emp.setPhone(778448484);
        System.out.println(emp.getEmpId()+"   "+emp.getEmpName()+"    "+emp.getEmpAddress()+"  "+emp.getPhone());
        
        
        //understanding how to reuse other package classes.
       TestEmployee test=new TestEmployee();
       
        
        
    }
}
