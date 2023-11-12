/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.datatypes;

/**
 *
 * @author syeda
 */
public class PrimitiveDataTypes {
    //normal num
    byte b;   //default values-  what is default values
    short s;
    int i;
    long l;
    
    //decimal
    float f;
    double d;
    
    char ch;
    boolean flag;
    
    public static void main(String[] args) {
        
        //need to create object
        
        //user define--    [datatypes   name = value];
        //class is ia used defined datattypes.
        
        PrimitiveDataTypes priObj=new PrimitiveDataTypes();        
        System.out.println("byte value::"+priObj.b);
        System.out.println("short value::"+priObj.s);
        System.out.println("int value::"+priObj.i);
        System.out.println("long value::"+priObj.l);
        
        
        System.out.println("float value::"+priObj.f);
        System.out.println("double value::"+priObj.d);
      
        System.out.println("boolean value::"+priObj.flag);
        
      //  priObj.
        
        
        
        
        
        
    }
    
    
    
   
    
}
