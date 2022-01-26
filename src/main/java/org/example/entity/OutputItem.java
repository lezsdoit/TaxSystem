package org.example.entity;

public class OutputItem {
    private String item;
    private double basePrice;
    private double finalPrice;

    public OutputItem(String item, double basePrice, double finalPrice) {
        this.item = item;
        this.basePrice = basePrice;
        this.finalPrice = finalPrice;
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

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }
}
