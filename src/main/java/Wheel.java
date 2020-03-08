package main.java;


import org.springframework.stereotype.Component;


@Component
public class Wheel {

    public Wheel(){
        System.out.println("Wheel creation");
    }

    public <typeAny  extends Integer> void  foo2 (typeAny value){
        System.out.println("scd  " + value );
    }

    @Annotations.JsonField
    private String firstName;
    @Annotations.JsonField
    private  String lastName;


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
}
