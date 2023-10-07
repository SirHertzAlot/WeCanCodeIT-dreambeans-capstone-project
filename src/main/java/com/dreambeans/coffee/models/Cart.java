package com.dreambeans.coffee.models;

import jakarta.persistence.*;

@Entity
public class Cart {
    @Id
    @GeneratedValue
    private long cartId;
    //private long customerId;
    private String itemsInCart;

    private int quantityInCart;

    private float subTotalForCart;

    private String timeCartWasCreated;

    public Cart() {
    }

    public Cart (String itemsInCart, int quantityInCart, float subTotalForCart,
            String timeCartWasCreated) {
        //this.customerId = customerId;
        this.itemsInCart = itemsInCart;
        this.quantityInCart = quantityInCart;
        this.subTotalForCart = subTotalForCart;
        this.timeCartWasCreated = timeCartWasCreated;
    }

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
    }

    // public long getCustomerId() {
    //     return customerId;
    // }

    // public void setCustomerId(long customerId) {
    //     this.customerId = customerId;
    // }

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

    public void setTimeCartWasCreated(String timeCartWasCreated) {
        this.timeCartWasCreated = timeCartWasCreated;
    }

}
