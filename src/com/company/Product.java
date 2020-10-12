package com.company;

public class Product {
private String name;
private float price;
private int quantity;
public Product(String name, float price,int quantity){
    this.name=name;
    this.price=price;
    this.quantity=quantity;
}
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName()
    {
        return this.name;
    }
    public float getPrice()
    {
        return this.price;
    }
    public int getQuantity()
    {
        return this.quantity;
    }
    @Override
    public String toString() {
        String str="\nНазвание: " + this.name +
                ", цена: " + this.price +
                ", кол-во: " + this.quantity;

        return str;

    }

}
