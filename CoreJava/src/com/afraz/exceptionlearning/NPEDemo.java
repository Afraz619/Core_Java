/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.exceptionlearning;

/**
 *
 * @author syeda
 */
public class NPEDemo {
    
    public static void main(String[] args) {
        String st=null;
       // System.out.println(st.length());
        
         String st1="Afraz";
        System.out.println(st1.length());
//        String stt="10";
//        
//         String stt2="12";
//         int a=Integer.parseInt(stt);
//         
//          int b=Integer.parseInt(stt2);
//         
//         int sss=a+b;
        
        int af=Integer.parseInt(st1);
        
        System.out.println(af);
    }
    
}
