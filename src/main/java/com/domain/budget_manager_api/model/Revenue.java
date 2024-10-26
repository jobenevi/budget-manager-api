package com.domain.budget_manager_api.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "revenues")
public class Revenue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private final String description;
    private final BigDecimal value;
    private final LocalDate date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Revenue(String description, BigDecimal value, LocalDate date) {
        this.description = description;
        this.value = value;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }
}