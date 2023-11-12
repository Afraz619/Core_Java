/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.inheritance;

/**
 *
 * @author syeda
 */
public class Cabin extends ClassRoom {
    
   public void openCabin(){
       System.out.println("Open cabin");
   } 
   
    public static void main(String[] args) {
        Cabin cb=new Cabin();
        
        cb.openGate();
        cb.OpenProjector();
        cb.openCabin();
        
    }
}
