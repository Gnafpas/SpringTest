package main.java.DAOs;

import main.java.SpringJPA.DBJDBCConnection;
import main.java.SpringJPA.UserBean;
import main.java.SpringJPA.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

@Component
public class UserCRUD {
    @Autowired
    private UserRepository repository;

       public static boolean getUserJDBC() {
           Connection conn ;
           conn = DBJDBCConnection.getConnection();
           if (conn != null) {
               try {
                   Statement stmt = conn.createStatement();
                   System.out.println("Creating statement...");
                   String sql = "SELECT * FROM user";
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

        public boolean addUser(long id, String name) {

            UserBean user = new UserBean();
            user.setName(name);
            user.setId(id);
            repository.save(user);
            return true;

        }

        public void showUsers() {
            List<UserBean> users = repository.custom(5L);
            for (UserBean u : users) {
                System.out.println(u.getName());
            }

            users = repository.findBynameCustom("John");
            for (UserBean u : users) {
                System.out.println(u.getName());
            }
        }

}
