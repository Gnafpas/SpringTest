package main.java.SpringBeans;


import main.java.CustomAnnotations.Annotations;

import java.util.function.Function;


public class Wheel {

    private int wheelCount;

    public void test(CarInterface car ){
        car.speed(1);

    }

    public Wheel(int wheelCount){
        System.out.println("Wheel creation");
        this.wheelCount = wheelCount;
    }

    public Wheel( ){
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

}
