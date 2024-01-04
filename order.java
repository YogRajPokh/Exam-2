package models;

import java.util.Arrays;

public class Order {
    public String Name;
    public String PhoneNumber;
    public int[] Items;
    public double[] Price;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int[] getItems() {
        return Items;
    }

    public void setItems(int[] items) {
        Items = items;
    }

    public double[] getPrice() {
        return Price;
    }

    public void setPrice(double[] price) {
        Price = price;
    }

    public Order(String name, String phoneNumber, int[] items, double[] prices) {
        this.Name = name;
        this.PhoneNumber = phoneNumber;
        this.Items = items;
        this.Price = prices;
    }

}