/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.col;


import java.util.TreeMap;

/**
 *
 * @author syeda
 */
public class DemoTreeMap {
    public static void main(String[] args) {
        TreeMap tr=new TreeMap();
        tr.put(11,"aa");
//        tr.put(null, 34);
        tr.put(3, "hyhd");
        tr.put(2, 45);
        
        //output1
        System.out.println(tr);
        
        //output2
        System.out.println(tr.entrySet());
        
        //for loop not applied but
        
        //if there is key and value we can apply this 
//        for (Object entrySet : tr.entrySet()) {
//            Object key = entrySet.getKey();
//            Object value = entrySet.getValue();
//            
//        }
        
    }
}
