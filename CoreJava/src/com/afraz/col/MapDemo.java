/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.col;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;


/**
 *
 * @author syeda
 */
public class MapDemo {
//    Map m;
//    HashMap hm;
//    TreeMap tm;
//    Hashtable ht;
    public static void main(String[] args) {
     HashMap hm=new HashMap();
     
     hm.put(1, 32);
     hm.put(2, "Raj");
     hm.put(3, "Help");
     hm.put(4, 45);
     hm.put(5, 112);
        System.out.println("-----------");
        
       
        
       // System.out.println(hm.put(4, "Bikram"));
        
         
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        hm.replace(1, 32, 55);
         System.out.println(hm.entrySet());
    }
    
    
    
}
