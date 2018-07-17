package com.MarqueBurgess;

public class ItemsPurchased {

    public String name;
    public double cost;

    public ItemsPurchased(String name, double cost){
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name + " cost -> $" + cost;
    }
}
