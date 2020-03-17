package main.java.SpringBeans;

/**
 * Created by George on 12/3/20.
 */
public class GenericClass {

    public <typeAny  extends Integer> void  genericMethod (typeAny value){
        System.out.println("scd  " + value );
    }
}
