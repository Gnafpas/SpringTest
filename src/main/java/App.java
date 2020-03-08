package main.java;


import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;


public class App {

    public static void main(String[] args) {


        //    @Autowired
//    UserRepository<UserBean> repository ;
//    public <typeAny  extends Comparable> void  foo (typeAny value){
//        System.out.println("scd  " + value );
//        repository.findByAge(1);
//
//
//    }
//    @Transactional
//    public void getAllUsers() {
//        repository.findAll();
//    }l


//        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println("Before context creation");
        ApplicationContext  ctx = SpringApplication.run(AppConfig.class, args);
        System.out.println("After context creation");

        Wheel wheel =new Wheel();
        wheel.setLastName("Nafpaktitis");
        wheel.setFirstName("George");

        Car gperson = ctx.getBean(Car.class);
        System.out.println("swefdsw "+ gperson.wheel.getFirstName());

        System.out.println(Annotations.findAnnotatedParameters(wheel));

    }


}