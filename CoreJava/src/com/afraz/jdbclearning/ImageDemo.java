/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.jdbclearning;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author syeda
 */
public class ImageDemo {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/college_db";
            String userName="root";
            String userPassword="welcome";
            String driverName="com.mysql.jdbc.Driver";
            String query="insert into empimagedemo values(?,?,?)";
            Class.forName(driverName);
            Connection con=DriverManager.getConnection(url, userName, userPassword);
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, 2);
            ps.setString(2,"watch");
            
            FileInputStream fis=new FileInputStream("C:\\Users\\syeda\\OneDrive\\Desktop\\AR\\10.png");
            ps.setBinaryStream(3, fis,fis.available());
            
            ps.executeUpdate();
        } catch (Exception ex) {
          ex.printStackTrace();
        }
    }
}
