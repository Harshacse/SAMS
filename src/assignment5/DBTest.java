/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import com.mysql.jdbc.Connection;
import java.sql.*;

/**
 *
 * @author tejas
 */
public class DBTest {
    private static final String USERNAME="root";
    private static final String PASSWORD="kopparty6";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/classicmodels";
    
    public static void main(String[] args)
    {
        Connection con=null;
        try{
            con=(Connection) DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("Connected");
            PreparedStatement create=con.prepareStatement("CREATE TABLE pet (name VARCHAR(20), owner VARCHAR(20))");
            create.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        finally{System.out.println("Function Complete");
    }
    }
    
}
