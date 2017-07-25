package com.example.demo;

public abstract class Products {

    private String name;
    private double price;

    public Products() {
    }

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Product[name:" + name +  ", price: " + price + "]";
    }
}
