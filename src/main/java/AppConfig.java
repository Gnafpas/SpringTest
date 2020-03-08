package main.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    Wheel getPerson (){
        return new Wheel();
    }

    @Bean
    Car getGeneralPerson (){
        return new Car(getPerson());
    }

    @Bean
    SpringBean getSpringBean (){
        return new SpringBean();
    }

}
