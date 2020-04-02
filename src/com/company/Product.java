package com.company;

public class Product {

    private String name;
    public double price;
    public int numberOfItems;
    private String produceCode;

    public Product(String name, double price, String produceCode) {
        this.name = name;
        this.price = price;
        this.produceCode = produceCode;
    }

    public Product(String name, double price, String produceCode, int numberOfItems){
        this.name = name;
        this.price = price;
        this.produceCode = produceCode;
        this.numberOfItems = numberOfItems;
        if (numberOfItems < 0){
            System.out.println("error. number of items can not be less than 0");
        }
    }


    public String getName() {

        return name;
    }

    public String getProduceCode() {

        return produceCode;
    }


    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getAmount() {
        return numberOfItems;
    }
    public void setAmount(int amount) {
        if(amount<0){
            System.out.println("error. number of items can not be less than 0");
        } else{
            this.numberOfItems = amount;
        }
    }
}