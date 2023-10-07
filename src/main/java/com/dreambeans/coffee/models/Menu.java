package com.dreambeans.coffee.models;

import jakarta.persistence.*;
import java.util.ArrayList;

@Entity
public class Menu {

    @Id
    @GeneratedValue
    protected long id;

    protected String name;

    protected String size;

    protected float price;

    protected String description;

    protected String image;

    // @OneToMany
    // private List<Product> products;

//    protected ArrayList<Product> products = new ArrayList<>();

    public Menu() {
    }

    public Menu(String name, String size, float price, String description, String image) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
        this.size = size;
    }

    /*public void addProduct(Product product) {
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
