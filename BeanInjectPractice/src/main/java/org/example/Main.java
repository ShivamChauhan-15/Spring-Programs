package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("org.example");
//        School sc=context.getBean( School.class);
//
//        Student st=context.getBean(Student.class);
        Student st2=context.getBean(Student.class);
        System.out.println(st2);
        Student st3=context.getBean(Student.class);
        System.out.println(st3);
    }
    @Bean
    @Scope("prototype")
    public static Student createStudent(){
        return new Student();
    }
}