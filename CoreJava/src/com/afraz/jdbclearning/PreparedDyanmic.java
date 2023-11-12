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
import java.sql.SQLException;


/**
 *
 * @author syeda
 */
public class PreparedDyanmic {
    public static void main(String[] args) {
        Connection con=ConnectMySql.getConnection();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter ID::");
            
        try {
            PreparedStatement pstm=con.prepareStatement(null);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
}
