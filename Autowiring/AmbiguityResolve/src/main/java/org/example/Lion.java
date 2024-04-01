package org.example;

import org.springframework.stereotype.Component;

@Component
public class Lion implements AnimalType {
    public void name(){
        System.out.println("Lion");
    }
}
