
package com.afraz.jdbclearning;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author syeda
 */
public class DeleteDemo {
    public static void main(String[] args) {
        String sqlQuery="delete from students where studentId=5";
        Connection con=ConnectMySql.getConnection();
        try {
             Statement stm=con.createStatement();
            int result= stm.executeUpdate(sqlQuery);
            System.out.println(result);
        } catch (Exception e) {
        }
       
        
    }
}
