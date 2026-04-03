package com.isha.controller;
import com.isha.service.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Controller
@Component
public class MyController
{
    //constructor
    //public MyController()
    //{
     //   System.out.println("Controller bean is created");
   // }

    // for @Qualifier

    @Autowired
    @Qualifier("student2")   // choose XML bean
    private Student student;
    /*
    Beans:
    student1 → annotation
    student2 → XML
    Controller: injects student2 using @Qualifier
    Constructor runs twice → PRINTS TWICE
     */

}
