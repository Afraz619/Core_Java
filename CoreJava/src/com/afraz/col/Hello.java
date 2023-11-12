/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.col;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author syeda
 */
public class Hello {
    Iterable a;
    Collection c;
    List list;
    Set set;
    ArrayList alist;
    LinkedList ll;
    
    public static void main(String[] args) {
        
        ArrayList alist=new ArrayList();
        alist.add("aa");
        alist.add(98);
        alist.add("***");
        alist.add(43);
        alist.add("aa");
        //Returns an iterator over the elements in this list in proper sequence.
       Iterator itr= alist.iterator();
       /* while (itr.hasNext()) {
         //   Object next = itr.next();
            
            System.out.println(itr.next());
            
        }*/
        System.out.println(alist.get(3));
        ArrayList alist2=new ArrayList();
        alist2.add(12);
        alist2.add("hello");
        alist2.add("hyd");
        alist2.add(52);
        alist2.add(19);
//        alist.
        
//        alist.addAll(5, alist2);
        
        System.out.println(alist); 
        
        ArrayList numList=new ArrayList();
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(6);
        
//        numList.forEach((e)->{
//            e=e+2;
//        });
//       
        
    }
    
    
    
}
