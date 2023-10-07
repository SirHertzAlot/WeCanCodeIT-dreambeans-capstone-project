package com.dreambeans.coffee.models;

import jakarta.persistence.*;
import java.util.ArrayList;

@Entity
public class Inventory {
    @Id
    @GeneratedValue
    protected long id;

    protected String name;

    protected String imageUrl;

    protected int amount;

    public Inventory() {
    }

    public Inventory(String name, String imageUrl, int amount) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.amount = amount;
    }

    /*private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
