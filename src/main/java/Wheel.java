package main.java;


import org.springframework.stereotype.Component;



public class Wheel {

    private int wheelCount;

    public Wheel(int wheelCount){
        System.out.println("Wheel creation");
        this.wheelCount = wheelCount;
    }

    public <typeAny  extends Integer> void  foo2 (typeAny value){
        System.out.println("scd  " + value );
    }

    @Annotations.JsonField
    private String firstName;
    @Annotations.JsonField
    private  String lastName;

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void bla(int i ){}


}
