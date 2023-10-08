package com.dreambeans.coffee.models;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;

    private String password;
    @OneToMany(mappedBy = "customer")
    private Collection<Cart> carts;
    public Customer() {
    }

    public Customer(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Collection<Cart> getCarts() { return carts; }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
