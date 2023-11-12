/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.stringdemo;

/**
 *
 * @author syeda
 */
public class ImmutableSt {
    public static void main(String[] args) {
        String s="Syed";
        
        String s2="SYED";
        
        // s=s.concat("Afraz");
        
        
        System.out.println("s has::  "+s);
       // System.out.println("after new object::"+stu);
       // System.out.println(s.compareTo(s2));//this internally it is using logic of comparator
        
        System.out.println(s.equalsIgnoreCase(s2));
        
        
        
        String ss="Bikram singh";
        System.out.println(ss);
        
        System.out.println(ss.substring(6));//prefix index count
        
        System.out.println(ss.substring(2, 8));
        //
        
    }
    
}
