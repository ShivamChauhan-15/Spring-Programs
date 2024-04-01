package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class NoteBook {
    @Value("100")
    int price;
//    public void setPrice(int price){
//        System.out.println("Setting notebook price...");
//        this.price=price;
//    }
    @Override
    public String toString() {
        return "Book price: "+price;
    }
    @PostConstruct
    public void start(){
        System.out.println("Inside start method");
    }
    @PreDestroy
    public void end(){
        System.out.println("Inside destroy method");
    }


}
