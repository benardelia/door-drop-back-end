package com.bravetech.doordrop.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "vender_id")
    private User vendor;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private LocalDate added;
    private LocalDate updated;

    public User getVendor() {
        return vendor;
    }

    public void setVendor(User vendor) {
        this.vendor = vendor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAdded(LocalDate added) {
        this.added = added;
    }

    public void setUpdated(LocalDate updated) {
        this.updated = updated;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getAdded() {
        return added;
    }

    public LocalDate getUpdated() {
        return updated;
    }
}
