package com.example.demo;

public class Disk extends Products {

    private int capacity;

    public Disk() {
        super();
    }

    public Disk(String name, double price) {
        super(name, price);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
