package com.bravetech.doordrop.repositories;

import com.bravetech.doordrop.models.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetails, String> {
}
