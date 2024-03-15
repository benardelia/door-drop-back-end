package com.bravetech.doordrop.repositories;

import com.bravetech.doordrop.models.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepository extends JpaRepository<Messages, Integer> {
}
