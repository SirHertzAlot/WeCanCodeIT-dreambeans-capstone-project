package com.dream_beans.coffee.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Inventory {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String imageUrl;

    private int amount;

    protected Inventory() {

    }

    @OneToMany
    private List<Product> products;

    public Inventory(String name, int amount, String imageUrl) {

        this.name = name;
        this.amount = amount;
        this.imageUrl = imageUrl;
    }

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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
