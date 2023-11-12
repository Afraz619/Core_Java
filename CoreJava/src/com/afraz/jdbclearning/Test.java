/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.jdbclearning;

import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.sql.RowSet;

/**
 *
 * @author syeda
 */
public class Test {
    Driver d;
    Connection con;
    Statement stm;
    PreparedStatement od;
    CallableStatement cb;
    ResultSet rs;
    ResultSetMetaData rsmd;
    
    DatabaseMetaData sb;
    RowSet rows;
    
    DriverManager dm;
    Blob b;
    Clob cbb;
    
}
