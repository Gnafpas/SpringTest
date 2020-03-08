package main.java.DAOs;

import main.java.DB.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserCRUD {

   public static boolean createUser() {
       Connection conn ;
       conn = DBConnection.getConnection();
       if (conn != null) {
           try {
               Statement stmt = conn.createStatement();
               System.out.println("Creating statement...");
               String sql = "SELECT id FROM user";
               ResultSet rs = stmt.executeQuery(sql);
               while (rs.next()) {
                   //Retrieve by column name
                   int id = rs.getInt("id");
                   String name = rs.getString("Name");
                   //Display values
                   System.out.print("ID: " + id);
                   System.out.print(", Name: " + name);
               }
               //STEP 6: Clean-up environment
               rs.close();
               stmt.close();
               conn.close();
           }catch(Exception e){
               e.printStackTrace();
           }finally {

           }
           return true;
       }else
           return false;
   }

}
