/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.variables;

/**
 *
 * @author syeda
 */
public class Variables {
    
    //types ,how to access them,scope of the variable
    
    /**
    * we have three types of variables
    * static
    * non static
    * 
    * local
    * 
    * in java to access any non static - we need object
    * 
    * to access static we need- class name,
    * and local can be access in the same block?
    */
    
    static int a=2;// static
    
    //non-static(instance variable)
    
    int b=9;
    
    public static void main(String[] args) {
        int a=6;
        System.out.println("accessing static::"+Variables.a);
        
        Variables varObj=new Variables();
        
        System.out.println("printinh non static::"+varObj.b);
        System.out.println("local variable::"+a);
    
    }
    
}
