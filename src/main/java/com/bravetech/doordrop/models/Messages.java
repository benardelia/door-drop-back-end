package com.bravetech.doordrop.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Messages {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "message_id", nullable = false)
    private Long message_id;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;

    private String text;

    public void setMessage_id(Long message_id) {
        this.message_id = message_id;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public void setRead_at(LocalDate read_at) {
        this.read_at = read_at;
    }

    public Long getMessage_id() {
        return message_id;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getRead_at() {
        return read_at;
    }

    private LocalDate created;
    private LocalDate read_at;

    public Long getId() {
        return message_id;
    }

    public void setId(Long id) {
        this.message_id = id;
    }
}
