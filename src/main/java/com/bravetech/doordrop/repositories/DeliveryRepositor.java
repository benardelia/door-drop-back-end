package com.bravetech.doordrop.repositories;

import com.bravetech.doordrop.models.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepositor extends JpaRepository<Delivery, Integer> {
}
