package main.java.SpringBeans;


import main.java.CustomAnnotations.Annotations;


public class Wheel {

    private int wheelCount;

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
