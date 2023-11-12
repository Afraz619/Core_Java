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

/**
 *
 * @author syeda
 */
public class ShowTable {
    public static void ShowMySqlTable(){
        Connection con =ConnectMySql.getConnection();
        try {
             Statement stm = con.createStatement();
            System.out.println("Connection eastablized");
            ResultSet rs = stm.executeQuery("SELECT * FROM students");
            System.out.println("current table \n");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + ".  " + rs.getString(2) + "   " + rs.getString(3));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
