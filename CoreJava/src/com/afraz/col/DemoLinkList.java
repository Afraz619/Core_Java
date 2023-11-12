/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.col;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author syeda
 */
public class DemoLinkList {
    public static void main(String[] args) {
        LinkedList alist=new LinkedList();
        alist.add(34);
        alist.add("ad");
        alist.add(34);
        Iterator itr = alist.iterator();
        while (itr.hasNext()) {
//            Object next = itr.next();
            System.out.println(itr.next());
        }
        
        //seconnd method
        for (Object b : alist) {
            System.out.println(b);
        }
    }
}
