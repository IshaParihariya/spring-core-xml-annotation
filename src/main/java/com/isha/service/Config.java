package com.isha.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config
{
    // constructor
    public Config()
    {
        System.out.println("Config bean is created");
    }

    // NOTE : A bean is always in a config
    // Password bean
    @Bean
    public Password createPasswordBean()
    {
        // object created by the develeoper but it is a part of IOC spring container as @Bean
        Password p=new Password("abc");
        return p;
    }
}
