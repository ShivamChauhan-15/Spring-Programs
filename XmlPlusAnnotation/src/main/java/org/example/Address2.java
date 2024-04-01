package org.example;

public class Address2 {
    int sector;
    String city;
    String state;

    public Address2() {
    }

    public Address2(int sector, String city, String state) {
        this.sector = sector;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return sector+" "+city+" "+state;
    }
}
