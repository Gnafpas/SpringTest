package main.java;


import main.java.DAOs.UserCRUD;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.integration.core.GenericSelector;
import org.springframework.integration.selector.MetadataStoreSelector;


@SpringBootApplication
public class App implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("Before context creation");
        ApplicationContext  ctx = SpringApplication.run(App.class, args);
        System.out.println("After context creation");
        /**
         * Spring Beans
         */
        Car car = ctx.getBean(Car.class);
        car.getWheel().setFirstName("Nafpas");
        System.out.println("swefdsw "+ car.getWheel().getFirstName());

        /**
         * Custom Annotations
         */
        Wheel wheel =new Wheel(4);
        wheel.setLastName("Nafpaktitis");
        wheel.setFirstName("George");
        System.out.println(Annotations.findAnnotatedParameters(wheel));


        Wheel wheel2 = ctx.getBean(Wheel.class);
        System.out.println(wheel2.getWheelCount());
//        Wheel::bla(1);

        UserCRUD userCRUD = ctx.getBean(UserCRUD.class);
        userCRUD.showUsers();


        GenericSelector<Integer>   bla= (Integer x) -> true;
        bla.accept(new Integer(5));

//        CarInterface inter = CarInterface::speed(10);

    }


    @Override
    public void run(String... args) {

    }


}