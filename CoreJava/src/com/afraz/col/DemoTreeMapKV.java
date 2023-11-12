/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.col;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author syeda
 */
public class DemoTreeMapKV {

  
    
    
    public static void main(String[] args) {
        TreeMap<Integer,String> tr1=new TreeMap<>();
        
        tr1.put(5, "aa");
        tr1.put(44, "bb");
        tr1.put(1, "cc");
        
        
        for (Map.Entry<Integer, String> entrySet : tr1.entrySet()) {
            Integer key = entrySet.getKey();
            String value = entrySet.getValue();
            
            System.out.println(key+" = "+value);
        }
//        System.out.println(tr1);
    }
    
}
