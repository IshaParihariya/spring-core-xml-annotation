package com.isha.service;


// for bean purpose in Configuration
// NOTE : A bean is always in a config
public class Password
{
    String pass;
    // constructor
    public Password(String pass)
    {
        this.pass=pass;
        System.out.println("Password bean is created");
    }

    // for the purpose of knowing if it is in the IOC container or not
    // in LaunchApp(main)
    public void passwordBean()
    {
        System.out.println("Password bean in the IOC container");
    }
}
