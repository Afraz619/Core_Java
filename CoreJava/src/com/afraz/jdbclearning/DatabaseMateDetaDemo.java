/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.jdbclearning;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 *
 * @author syeda
 */
public class DatabaseMateDetaDemo {
     public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/college_db";
        String userName="root";
        String userPassword="welcome";
        String driverName="com.mysql.jdbc.Driver";
       // String query="select *from students";
        try {
            Class.forName(driverName);
           Connection con=DriverManager.getConnection(url, userName, userPassword);
           // PreparedStatement ps=con.prepareStatement(query);
           // ResultSet rs=ps.executeQuery();
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println(dbmd.getDriverName());
            System.out.println(dbmd.getDriverVersion());
            System.out.println(dbmd.getUserName());
            System.out.println(dbmd.getDatabaseProductName());
            System.out.println(dbmd.getDatabaseProductVersion());
            
                   
            
        } catch (Exception e) {
        }
        
    }
    
}
