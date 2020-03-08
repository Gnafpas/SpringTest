package main.java;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class SpringBean {

    private String initMessage;
    private String casualMessage;

    public String getInitMessage() {
        return initMessage;
    }

    public void setInitMessage(String initMessage) {
        this.initMessage = initMessage;
    }

    public String getCasualMessage() {
        return casualMessage;
    }

    public void setCasualMessage(String casualMessage) {
        this.casualMessage = casualMessage;
    }

    @PostConstruct
    public void postConstruct() throws Exception {
        System.out.println("Init method after properties are set : " + initMessage);
    }
    @PreDestroy
    public void preDestroy() throws Exception {
        System.out.println("PreDestroy method");
    }
}
