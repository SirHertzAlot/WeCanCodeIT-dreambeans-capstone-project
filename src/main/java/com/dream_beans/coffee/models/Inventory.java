package com.dream_beans.coffee.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Coffee_Inventory")
public class Inventory {

    @GeneratedValue
    @Id
    private long id;

    @Column
    private String name;

    @Column
    private String imageUrl;

    @Column(name = "amount", nullable = true)
    private int amount;

    protected Inventory() {

    }

    public Inventory(long id, String name, int amount, String imageUrl) {
        this.id = id;
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
