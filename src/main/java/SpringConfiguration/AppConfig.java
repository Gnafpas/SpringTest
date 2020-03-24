package main.java.SpringConfiguration;

import main.java.SpringBeans.Wheel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@Configuration
@Lazy
public class AppConfig {



    @Bean
    Wheel getWheel (){
        return new Wheel(4);
    }

//    @Bean
//    Car getCar (){
//        return new Car(getWheel());
//    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("Morrison1991!");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false");
        return dataSource;
    }



}
