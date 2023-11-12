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
public class OrganizationCoding  extends RequirmentdOpenInOrganization{
    //again coding--this,super and final
    @Override
    public void coding(){
       super.coding();
        System.out.println("person should know java");
        
    }
    
    public static void main(String[] args) {
        OrganizationCoding coding=new OrganizationCoding();
        coding.coding();
    }
    
}
