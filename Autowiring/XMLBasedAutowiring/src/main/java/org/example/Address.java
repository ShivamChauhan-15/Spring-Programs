package org.example;

public class Address {
    int sector;
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
