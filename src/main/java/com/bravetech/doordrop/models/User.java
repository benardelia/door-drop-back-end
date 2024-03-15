package com.bravetech.doordrop.models;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

@Entity
@Table(name ="\"user\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private String id;
    @Column(unique = true, nullable = false)
    private String username;

    private  String password;

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
