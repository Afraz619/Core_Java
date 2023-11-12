/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.col;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author syeda
 */
public class MapDemoKV {
    public static void main(String[] args) {
        HashMap<Integer,String> hmp=new HashMap<Integer, String>();
        
        hmp.put(1, "India");
        hmp.put(2, "Delhi");
        hmp.put(3, "Kolkata");
        hmp.put(4, "Goa");
        hmp.put(5, "Hyderabad");
      //  hmp.put(4, "Mumbai");
        hmp.put(null, null);
     //   hmp.put(null, "Kerla");
        
        for (Map.Entry<Integer, String> entrySet : hmp.entrySet()) {
            Integer key = entrySet.getKey();
            String value = entrySet.getValue();
            System.out.println(key+"         "+value);
            
        }
    }
    
}
