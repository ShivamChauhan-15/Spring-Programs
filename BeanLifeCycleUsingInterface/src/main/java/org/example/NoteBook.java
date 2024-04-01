package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NoteBook implements InitializingBean, DisposableBean {
    int price;
    public void setPrice(int price){
        System.out.println("Setting notebook price...");
        this.price=price;
    }
    @Override
    public String toString() {
        return "Book price: "+price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside notebook init method");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Inside notebook destroy method");
    }
}
