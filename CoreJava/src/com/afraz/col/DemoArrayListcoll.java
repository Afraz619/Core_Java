/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.col;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author syeda
 */
public class DemoArrayListcoll {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a1.add(60);
        a1.add(7);
        a1.add(8);
        a1.add(9);
        a1.add(100);
        a1.add(11);
        a1.add(12);
        a1.add(13);
        a1.add(14);
        a1.add(15);
        a1.add(16);
        a1.add(17);
        a1.add(18);
        a1.add(19);
        a1.add(20);
        
        Collections.addAll(a1, 21,22);
        System.out.println(a1);
        
        System.out.println(Collections.max(a1));
        System.out.println(Collections.min(a1));
        System.out.println(Collections.binarySearch(a1, 20));
        
    }
}
