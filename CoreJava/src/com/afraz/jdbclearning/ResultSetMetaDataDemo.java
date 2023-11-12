/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 *
 * @author syeda
 */
public class ResultSetMetaDataDemo {
 
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/college_db";
        String userName="root";
        String userPassword="welcome";
        String driverName="com.mysql.jdbc.Driver";
        String query="select *from students";
        try {
            Class.forName(driverName);
           Connection con=DriverManager.getConnection(url, userName, userPassword);
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData result=rs.getMetaData();
            System.out.println("no of col:"+result.getColumnCount());
            System.out.println("Name of the column:: :"+result.getColumnName(2));
            System.out.println("type of the column:: :"+result.getColumnTypeName(3));
            
            
        } catch (Exception e) {
        }
        
    }
}
