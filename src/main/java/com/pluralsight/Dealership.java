package com.pluralsight;

import java.util.ArrayList;

public class Dealership extends Vehicle {

    private String name;
    private String address;
    private String phone;

    ArrayList Vehicle = new ArrayList<>();
 //   inventory: ArrayList<Vehicle>

    public Dealership(String name, String address, String phone) {

        this.name = name; this.address = address; this.phone = phone;
    }


}