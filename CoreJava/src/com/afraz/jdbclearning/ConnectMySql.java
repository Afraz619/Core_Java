
package com.afraz.jdbclearning;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author syeda
 */
public class ConnectMySql {
    private static String url = "jdbc:mysql://localhost:3306/college_db";    
    private static String driverName = "com.mysql.jdbc.Driver";   
    private static String userName = "root";   
    private static String password = "welcome";
    private static Connection con;
   

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, userName, password);
                System.out.println("connected to database");
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
        return con;
    }
}
