/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.jdbclearning;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
/**
 *
 * @author syeda
 */
public class ConnectToDB {

    public static void main(String[] args) {
        Connection con = null;

        String userName = "root";

        String userPassword = "welcome";
        String urlConnect = "jdbc:mysql://localhost:3306/college_db";
        try {
            
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(urlConnect, userName, userPassword);
            // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collage_db","welcome""root");
            Statement stm = con.createStatement();
            System.out.println("Connection eastablized");
            ResultSet rs = stm.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + "   " + rs.getString(2) + "      " + rs.getString(3));

            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
			System.out.println("Error while connecting to the database");
        }

    }

}
