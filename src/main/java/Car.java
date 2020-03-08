package main.java;

import org.springframework.stereotype.Component;

@Component
public class Car {

    Wheel wheel;

    public Car(Wheel wheel){
         this.wheel = wheel;
    }


    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
