/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author syeda
 */
public class InsertDemo {
    public static void main(String[] args) {
        Connection con=null;
        String userName="root";
        String userPassword="welcome";
        String url=("jdbc:mysql://localhost:3306/college_db");
        String sqlquery="Insert into students values(8,'raju','france')";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,userName, userPassword);
            Statement stm=con.createStatement();
            int count=stm.executeUpdate(sqlquery);
            System.out.println("record:"+count);
        } catch (Exception e) {
        }
       
    }
            
}
