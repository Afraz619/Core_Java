/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.col;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author syeda
 */
public class SetDemo {
    
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add(23);
        hashSet.add("aa");
        hashSet.add(23);
        hashSet.add("av");
        hashSet.add(null);
        Iterator itr=hashSet.iterator();
        while (itr.hasNext()) {
            Object next = itr.next();
            System.out.println(next);
            
        }
        System.out.println("------------------------------");
        //hashSet.remove(23);
        System.out.println(hashSet.contains(23));
         Iterator itr1=hashSet.iterator();
        while (itr1.hasNext()) {
            Object next = itr1.next();
            System.out.println(next);
            
        }
        
    }
    
}
