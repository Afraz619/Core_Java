/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.jdbclearning;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author syeda
 */
public class PreparedDemo {
    public static void main(String[] args) {
        try {
                 Connection con= ConnectMySql.getConnection();
         String query="insert into students values(?,?,?)";    
            PreparedStatement ps= con.prepareStatement(query);
            ps.setInt(1, 16);
            ps.setString(2, "12");
            ps.setString(3, "HYD");
            
       int count    = ps.executeUpdate();
       if(count>0){
           System.out.println("success");
       }else{
           System.out.println("Check...");
       }
                 
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
}
