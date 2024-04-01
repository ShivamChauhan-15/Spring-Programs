package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Elephant implements AnimalType {
    public void name(){
        System.out.println("Elephant");
    }

}
