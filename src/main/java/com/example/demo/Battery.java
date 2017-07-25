package com.example.demo;

public class Battery extends Products {

    private boolean rechargeable;

    public Battery() {
        super();
    }

    protected Battery(String name, double price) {
        super(name, price);
    }

    public boolean isRechargeable() {
        return rechargeable;
    }

    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }
}
