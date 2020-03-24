package main.java.Lambdas;

import main.java.SpringBeans.Car;
import main.java.SpringBeans.CarInterface;
import main.java.SpringBeans.Wheel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.integration.core.GenericSelector;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.Pollers;
import org.springframework.integration.dsl.channel.MessageChannels;
import org.springframework.lang.Nullable;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

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


//        Comparator c = ( c1, c2) -> Integer.parseInt(c1.toString())+Integer.parseInt(c2.toString());
//        c.compare("1","2");
//        Comparator ca = Comparator.comparing(Integer::bitCount);
////        Comparator.comparing(1,2);
//        int a = ca.compare(3,1);
//        System.out.println("ascasx "+a);

        wheel2.test( ( x) -> System.out.println("Eurikaaa "+ x+1));


        MessageSource m = new MessageSource(){
            @Override
            public String  getMessage(MessageSourceResolvable var1, Locale var2) throws NoSuchMessageException{
                return "sd";
            };
            @Override
            public String getMessage(String var1, @Nullable Object[] var2, @Nullable String var3, Locale var4){
                return "sd";
            };
            @Override
            public String getMessage(String var1, @Nullable Object[] var2, Locale var3) throws NoSuchMessageException{
                return "sd";
            };
        };

//        m.getMessage();
//
//        IntegrationFlows.from(c -> c.poller(Pollers.fixedRate(100)),
//                c -> c.poller(Pollers.fixedRate(100)))
//                .channel("inputChannel")
//                .filter((Integer p) -> p > 0)
//                .transform(Object::toString)
//                .channel(MessageChannels.queue())
//                .get();
    }
}
