package com.bravetech.doordrop.repositories;

import com.bravetech.doordrop.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {
    User findAllByUsernameAndPassword(String username, String password);
}
