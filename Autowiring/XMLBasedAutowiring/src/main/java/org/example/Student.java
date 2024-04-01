package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {
    Address address1;
    @Value("Shivam")
    String name;
    public Student() {
        System.out.println("no-arg constructor");
    }
    public Student(Address address){
        System.out.println("Parametrized Constructor");
        this.address1=address;

    }
//    public Student(String name){
//        this.name=name;
//        System.out.println("String Constructor");
//    }
    public void setAddress(Address address){
        System.out.println("setter method");
        this.address1=address;

    }
    public Address getAddress(){
        return address1;
    }

    public String getName(){return name;}
}
