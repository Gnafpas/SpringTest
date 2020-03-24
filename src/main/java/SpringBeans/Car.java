package main.java.SpringBeans;

import org.springframework.stereotype.Component;

@Component
public class Car implements CarInterface {

    private Wheel wheel;
    private Driver driver;


    public Car(Driver driver, Wheel wheel){
        this.driver = driver;
        this.wheel = wheel;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }


    @Override
    public void speed(int i) {

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
