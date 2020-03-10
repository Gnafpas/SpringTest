package main.java;


import main.java.DAOs.UserCRUD;
import main.java.DB.UserBean;
import main.java.DB.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.support.Repositories;


import java.util.List;

@SpringBootApplication
public class App implements CommandLineRunner {

    public static void main(String[] args) {
        ApplicationContext  ctx = SpringApplication.run(App.class, args);
        Wheel wheel = ctx.getBean(Wheel.class);
        System.out.println(wheel.getWheelCount());
        UserCRUD userCRUD = ctx.getBean(UserCRUD.class);
        userCRUD.showUsers();
    }


    @Override
    public void run(String... args) {
        /**
         * Spring Beans
         */
//      ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        System.out.println("Before context creation");
//        ApplicationContext  ctx = SpringApplication.run(AppConfig.class, args);
//        System.out.println("After context creation");

//        Car car = ctx.getBean(Car.class);
//        car.getWheel().setFirstName("Nafpas");
//        System.out.println("swefdsw "+ car.getWheel().getFirstName());

        /**
         * Custom Annotations
         */
//        Wheel wheel =new Wheel();
//        wheel.setLastName("Nafpaktitis");
//        wheel.setFirstName("George");
//        System.out.println(Annotations.findAnnotatedParameters(wheel));
//

    }


}