package com.stackroute.demo;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println(" message is " +message);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Container is destroy! ");
    }
}

