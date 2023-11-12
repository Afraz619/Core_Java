/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.jdbclearning;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author syeda
 */
public class PreparedUpdate {
    public static void main(String[] args) {
        try {
                 Connection con= ConnectMySql.getConnection();
            String updateQuery=" update students set studentName=? where studentId=?";    
            PreparedStatement ps= con.prepareStatement(updateQuery);
            
            ps.setString(1, "Change");
            ps.setInt(2, 13);
       
            
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
