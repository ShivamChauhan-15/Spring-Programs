package org.example;

public class Address {
    private int sector;
    private String city;
    private String state;

    public Address(int sector, String city, String state) {
        this.sector = sector;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return sector+" "+city+" "+state;
    }
}
