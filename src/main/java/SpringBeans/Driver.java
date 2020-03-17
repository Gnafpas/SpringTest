package main.java.SpringBeans;

import org.springframework.stereotype.Component;

@Component
public class Driver extends Person {

    private String driverLicence;
    public void brake(){

    }
    public String getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(String driverLicence) {
        this.driverLicence = driverLicence;
    }
}
