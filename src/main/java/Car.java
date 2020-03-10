package main.java;

import org.springframework.stereotype.Component;

@Component
public class Car implements CarInterface{

    private Wheel wheel;
    private Driver driver;


    public Car(Driver driver, Wheel weel){
        this.driver = driver;
        this.wheel = weel;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }


    @Override
    public void speed() {

    }

    public Wheel getWheel() {
        return wheel;
    }

    public int position(int x,int y ){
        return x+y;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
