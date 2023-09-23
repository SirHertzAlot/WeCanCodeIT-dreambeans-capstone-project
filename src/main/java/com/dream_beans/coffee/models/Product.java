package com.dream_beans.coffee.models;
import javax.persistence.Entity;
import java.util.UUID;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private long id;

    private int price;
    private String description;
    private String name;
    private String size;

    public Product() {
        this.id = UUID.randomUUID().toString();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    // public void setId(int id) {
    // this.id = id;
    // }

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
