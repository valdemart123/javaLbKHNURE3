package com.company;

public class Product {
    private  int id;
    private int year;
    private String mark;
    private String model;
    private String color;
    private double price;
    private String number;

    public Product (int id, String mark, String model, double price) {
        this.id=id;
        this.mark=mark;
        this.model=model;
        this.price=price;
    }
    public Product (int id, String mark, String model, double price, int year, String color, String number) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.year = year;
        this.color = color;
        this.number = number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString () {
        String result;
        result = "Mark: "+mark+"\n"+"Model: "+model+"\n"+" Year: "+year+"\n"+" Color: "+color+"\n"+
                "Price: "+price+"\n"+"Number: "+number+"\n";
        return result;
    }
}
