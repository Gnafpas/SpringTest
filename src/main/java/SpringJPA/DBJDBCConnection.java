package main.java.SpringJPA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBJDBCConnection {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false";;

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "Morrison1991!";

    public static Connection getConnection(){
        Connection conn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        }catch(SQLException se){
            //Handle errors for JDBC
            System.out.println("sdcdscsdcsd");
            se.printStackTrace();
        }catch(ClassNotFoundException ex){

            ex.printStackTrace();
        }
        return conn;
    }


}
