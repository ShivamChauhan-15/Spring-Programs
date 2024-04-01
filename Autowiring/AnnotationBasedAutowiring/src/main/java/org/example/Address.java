package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("62")
    int sector;
    @Value("Noida")
    String city;
    public Address() {
    }
    public Address(int sector, String city) {
        this.sector = sector;
        this.city = city;
    }

    @Override
    public String toString() {
        return sector+" "+city;
    }
}
