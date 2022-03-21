package com.example.models;

public class Donation {
    public int id;
    public int amount;
    public String method;

    public Donation() {
        this.amount = 0;
        this.method = "";
    }

    public Donation(int amount, String method) {
        this.amount = amount;
        this.method = method;
    }

    public String toString() {
        return this.id + "," + this.amount + ", " + this.method;
    }
}
