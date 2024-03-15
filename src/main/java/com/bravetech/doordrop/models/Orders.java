package com.bravetech.doordrop.models;

import com.bravetech.doordrop.logics.enums.OrderStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private User buyers_id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;
    private double price;
    private OrderStatus order_status;
    private LocalDate created;
    private LocalDate updated;
    private int quantity;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBuyers_id(User buyers_id) {
        this.buyers_id = buyers_id;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOrder_status(OrderStatus order_status) {
        this.order_status = order_status;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public void setUpdated(LocalDate updated) {
        this.updated = updated;
    }

    public User getBuyers_id() {
        return buyers_id;
    }

    public Products getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public OrderStatus getOrder_status() {
        return order_status;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getUpdated() {
        return updated;
    }
}
