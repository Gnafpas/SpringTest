package main.java.SpringBeans;

import org.springframework.context.ApplicationContext;

/**
 * Created by George on 12/3/20.
 */
public class SpringBeansImpl {

    public static void implement(ApplicationContext ctx){

        Car car = ctx.getBean(Car.class);

    }
}
