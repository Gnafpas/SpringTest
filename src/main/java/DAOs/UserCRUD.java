package main.java.DAOs;

import main.java.DB.DBConnection;
import main.java.DB.UserBean;
import main.java.DB.UserRepository;
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
           conn = DBConnection.getConnection();
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

        public boolean addUser() {

            UserBean user = new UserBean();
            user.setName("sdcas");
            user.setId(3L);
            repository.save(user);
            return true;

        }

        public void showUsers() {
            List<UserBean> users = repository.findByName("sdcas");
            for (UserBean u : users) {
                System.out.println(u.getName());
            }
        }

}
