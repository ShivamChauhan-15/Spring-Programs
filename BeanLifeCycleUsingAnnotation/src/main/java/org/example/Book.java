package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("200")
    int price;
    public void setPrice(int price){
        System.out.println("Setting book price...");
        this.price=price;
    }
    //name of init and destroy method maybe different but they should match in xml file
    public void init(){
        System.out.println("Inside init method");
    }
    public void destroy(){
        System.out.println("Inside destroy method");
    }

    @Override
    public String toString() {
        return "Book price: "+price;
    }
}
