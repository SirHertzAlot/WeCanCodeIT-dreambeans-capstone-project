package com.dreambeans.coffee.models;

import jakarta.persistence.*;

@Entity
public class Product { 
    @Id
    @GeneratedValue
    private Long id;
    private double price;
    private String description;
    private String name;
    private String image;
    private int quantity;
    
    public Product(double price, String description, String name, String image, int quantity, Menu menu) {
        this.price = price;
        this.description = description;
        this.name = name;
        this.image = image;
        this.menu = menu;
        this.quantity = quantity;
    }

    @ManyToOne
    private Menu menu;

    public Product() {
    }
    
    
    public int getQuantity() {
        return quantity;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public Long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }


    public Menu getMenu() {
        return menu;
    }
}


