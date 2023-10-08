package com.dreambeans.coffee.models;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Cart {
    @Id
    @GeneratedValue
    private long cartId;
    private String itemsInCart;

    private float subTotalForCart;

    private int quantityInCart;

    private String timeCartWasCreated;

    private int itemQuantity;
    private String orderedTime;
    private String orderedDate;
    @ManyToOne
    private Customer customer;


    public Cart() {
    }

    public Cart(Customer customer) {
        this.customer = customer;
        this.timeCartWasCreated = LocalDate.now().toString();
     }

    public String getOrderedTime() {
        return orderedTime;
    }

    public void setOrderedTime(String orderedTime) {
        this.orderedTime = orderedTime;
    }

    public String getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(String orderedDate) {
        this.orderedDate = orderedDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
    }

    public String getItemsInCart() {
        return itemsInCart;
    }

    public void setItemsInCart(String itemsInCart) {
        this.itemsInCart = itemsInCart;
    }

    public int getQuantityInCart() {
        return quantityInCart;
    }

    public void setQuantityInCart(int quantityInCart) {
        this.quantityInCart = quantityInCart;
    }

    public float getSubTotalForCart() {
        return subTotalForCart;
    }

    public void setSubTotalForCart(float subTotalForCart) {
        this.subTotalForCart = subTotalForCart;
    }

    public String getTimeCartWasCreated() {
        return timeCartWasCreated;
    }



    public boolean cartPaid() {
        return true;
    }
}
