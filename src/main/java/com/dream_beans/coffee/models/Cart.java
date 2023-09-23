package com.dream_beans.coffee.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart {
    @Id
    @GeneratedValue
    private long cartId;
    private long customerId;
    private String itemsInCart;

    private int quantityInCart;

    private float subTotalForCart;

    private String timeCartWasCreated;

    protected Cart(){}

    public Cart(long cartId, long customerId, String itemsInCart, int quantityInCart, float subTotalForCart, String timeCartWasCreated) {
        this.cartId = cartId;
        this.customerId = customerId;
        this.itemsInCart = itemsInCart;
        this.quantityInCart = quantityInCart;
        this.subTotalForCart = subTotalForCart;
        this.timeCartWasCreated = timeCartWasCreated;
    }

    public long getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public void setTimeCartWasCreated(String timeCartWasCreated) {
        this.timeCartWasCreated = timeCartWasCreated;
    }
}
