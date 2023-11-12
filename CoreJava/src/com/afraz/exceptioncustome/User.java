/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.exceptioncustome;

import java.util.Scanner;

/**
 *
 * @author syeda
 */
public class User {
 public void validateAge(int age){
     try{
         
    
        if(age<18)throw new  InvalidAgeException("Invalid age");
        
        else{
            System.out.println("valid:: welcome");
        }
    }catch(InvalidAgeException inv){
        inv.printStackTrace();
    }
     
 }
 
    public static void main(String[] args) {
        User user=new User();
        Scanner scn=new Scanner(System.in);
        System.out.println("enter age::");
        int age=scn.nextInt();
        user.validateAge(age);
    }
    
}
