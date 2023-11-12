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
public class ClassRoom extends Collage{
    
    public void OpenProjector(){
        System.out.println("Opening projector---");   
    }  
    public static void main(String[] args) {
        ClassRoom croom=new ClassRoom();
        
        croom.openGate();
        croom.OpenProjector();
    }
}
