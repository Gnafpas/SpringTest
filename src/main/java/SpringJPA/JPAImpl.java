package main.java.SpringJPA;

import main.java.DAOs.UserCRUD;
import org.springframework.context.ApplicationContext;

/**
 * Created by George on 12/3/20.
 */
public class JPAImpl {

    public static void implement(ApplicationContext ctx){

        UserCRUD userCRUD = ctx.getBean(UserCRUD.class);
        userCRUD.addUser(6,"George");
        userCRUD.showUsers();

    }
}
