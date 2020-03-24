package main.java.Lambdas;

import main.java.SpringBeans.Wheel;
import org.springframework.context.ApplicationContext;
import org.springframework.integration.core.GenericSelector;

/**
 * Created by George on 12/3/20.
 */
public class LambdasImpl {

    public static void implement(ApplicationContext ctx){
        GenericSelector<Integer> bla= (Integer x) -> true;
        bla::;
        bla.accept(new Integer(5));

        Wheel wheel2 = ctx.getBean(Wheel.class);
        System.out.println(wheel2.getWheelCount());
//        Wheel::bla()
//        CarInterface inter = CarInterface::speed(10);
    }
}
