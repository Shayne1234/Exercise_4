package com.company;

public class Car {
    private String model;
    private String brand;
    private int price;
    private String color;
    private int quantity;
    public int year;

    public Car(String model, String brand, int price, String color, int quantity) {
        this.model=model;
        this.brand= brand;
        this.price= price;
        this.color= color;
        this.quantity= quantity;

    }
    public String getModel(){
        return model;
    }
    public String setBrand(){
        return brand;

    }
    public String getColor()
    {
        return color;
    }
    public int getYear()
    {
        return year;

    }public int getQuality(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }

    public void setModel(String model){
        this.brand=color;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = (int) price;
    }
    void sell(int decrease){
        quantity = this.quantity -= decrease;
    }

    void delivery(int increment){
        quantity=quantity += increment;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

}
