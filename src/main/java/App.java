package main.java;



import groovy.util.AllTestSuite;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class App {

    public static void main(String[] args) {

        /**
         * Spring Beans
         */
//      ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println("Before context creation");
        ApplicationContext  ctx = SpringApplication.run(AppConfig.class, args);
        System.out.println("After context creation");

        Car car = ctx.getBean(Car.class);
        car.getWheel().setFirstName("Nafpas");
        System.out.println("swefdsw "+ car.wheel.getFirstName());

        /**
         * Custom Annotations
         */
        Wheel wheel =new Wheel();
        wheel.setLastName("Nafpaktitis");
        wheel.setFirstName("George");
        System.out.println(Annotations.findAnnotatedParameters(wheel));

    }

}