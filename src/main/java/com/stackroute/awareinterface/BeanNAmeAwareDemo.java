package com.stackroute.awareinterface;

import org.springframework.beans.factory.BeanNameAware;

public class BeanNAmeAwareDemo implements BeanNameAware{

    @Override
    public void setBeanName(String s) {
        System.out.println("String name:"+s);
    }
}

