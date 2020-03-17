package main.java;


import main.java.CustomAnnotations.AnnotationImpl;
import main.java.Lambdas.LambdasImpl;
import main.java.SpringBeans.SpringBeansImpl;
import main.java.SpringJPA.JPAImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class App implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("Before context creation");
        ApplicationContext  ctx = SpringApplication.run(App.class, args);
        System.out.println("After context creation");
        /**
         * Spring Beans
         */
        SpringBeansImpl.implement(ctx);
        /**
         * Custom Annotations
         */
        AnnotationImpl.implement(ctx);
        /**
         * Lambdas
         */
        LambdasImpl.implement(ctx);
        /**
         * SpringJPA
         */
        JPAImpl.implement(ctx);
    }


    @Override
    public void run(String... args) {
        //body of main method will moved to this method
    }


}