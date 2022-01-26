package org.example.entity;

public class Tax {
    private long minPrice;
    private long maxPrice;
    private long taxAmount;
    private String taxType;

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = (long) minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = (long) maxPrice;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = (long) taxAmount;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public Tax(long minPrice, long maxPrice, long taxAmount, String taxType) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.taxAmount = taxAmount;
        this.taxType = taxType;
    }
}
