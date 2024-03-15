package com.bravetech.doordrop.models;
import com.bravetech.doordrop.logics.enums.DeliveryStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToOne
    @JoinColumn(name = "order_id")
    private Orders order_id;
    private String address;
    private LocalDate delivery_date;
    private DeliveryStatus status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrder_id(Orders order_id) {
        this.order_id = order_id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDelivery_date(LocalDate delivery_date) {
        this.delivery_date = delivery_date;
    }

    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    public Orders getOrder_id() {
        return order_id;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDelivery_date() {
        return delivery_date;
    }

    public DeliveryStatus getStatus() {
        return status;
    }
}
