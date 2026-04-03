package com.isha.main;

import com.isha.service.Password;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.Bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp
{
    public static void main(String[] args)
    {
        /*
        If the same bean is defined in XML and annotation, XML overrides it.
        If defined with different IDs, both beans exist, which may cause ambiguity
         */
        ApplicationContext container =new ClassPathXmlApplicationContext("applicationconfig.xml");

        // to check if the bean Password is in the IOC container
        //@Bean is used in @Configuration classes for Java-based configuration

       Password pass= container.getBean(Password.class);
       pass.passwordBean();
    }
}