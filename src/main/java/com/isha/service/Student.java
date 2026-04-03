package com.isha.service;

import org.springframework.stereotype.Component;

@Component("student1")
public class Student
{
    //constructor
    public Student()
    {
        System.out.println("student1 bean created");
    }
}
