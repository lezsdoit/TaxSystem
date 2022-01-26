package org.example.entity;

public class Item {
    private String item;
    private double basePrice;
    private double discount;

    public Item(String item, double basePrice, double discount) {
        this.item = item;
        this.basePrice = basePrice;
        this.discount = discount;
    }

    public Item() {

    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
