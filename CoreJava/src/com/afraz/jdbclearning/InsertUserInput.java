/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.jdbclearning;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author syeda
 */
public class InsertUserInput {
    public static void main(String[] args) {
        Connection con =ConnectMySql.getConnection();
        //show table
        ShowTable.ShowMySqlTable();

       
        //insert    
        Scanner sc=new Scanner(System.in);
        System.out.println("\nInsert your data :");
        System.out.println("Enter id:");
        int id=sc.nextInt();
        System.out.println("Enter name:");
        String name=sc.next();
        System.out.println("Enter address:");
        String city=sc.next();
        String sqlQuery="Insert into students values('"+id+"','"+name+"','"+city+"')";
       
        try {
            Statement stm =con.createStatement();
           int result = stm.executeUpdate(sqlQuery);
            System.out.println("result :"+result);
        } catch (SQLException e) {
        }
        
        
        //show table
       ShowTable.ShowMySqlTable();
        
        
        
        
    }
}
