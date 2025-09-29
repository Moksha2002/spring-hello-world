package com.moksha.hello_world;

public class Expense {
    private int id;
    private String name;
    private double amount;

    //constructor
    public Expense(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    //getters
    public int getId() {return id; }
    public String getName() {return name; }
    public double getAmount() {return amount; }
}