/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.inheritance;

/**
 *
 * @author syeda
 */

//class com.afraz.inheritance.Test   = this is called fully qualified name
public class Test {
    
    //every java class will extends from Object class
    Object obj;
    
    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(t.getClass());
        System.out.println(t.toString());
      //  System.out.println(t.finalize());
    }
}
