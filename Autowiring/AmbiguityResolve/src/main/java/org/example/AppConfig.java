package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "org.example")
public class AppConfig {
//    @Bean
//    public Lion createLion() {
//        return new Lion();
//    }
//
//    @Bean
//    public Elephant createElephant() {
//        return new Elephant();
//    }
//
//    @Bean
//    public Animal createAnimal(){
//        Animal a=new Animal();
//        a.setAnimal(createLion());
//        return a;
//    }
}
