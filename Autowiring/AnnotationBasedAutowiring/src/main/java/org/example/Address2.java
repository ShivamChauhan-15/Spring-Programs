package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Address2 {
    @Value("15")
    int sector;
    @Value("Delhi")
    String city;

    public Address2() {
    }

    public Address2(int sector, String city) {
        this.sector = sector;
        this.city = city;
    }

    @Override
    public String toString() {
        return sector+" "+city;
    }
}
