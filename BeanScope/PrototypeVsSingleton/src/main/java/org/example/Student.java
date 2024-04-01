package org.example;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Student {
    private String name;
    public Student(){
        System.out.println("Student Constructor...");
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

//    @Override
//    public String toString() {
//        return name;
//    }
}
