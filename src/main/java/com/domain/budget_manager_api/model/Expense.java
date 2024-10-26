package com.domain.budget_manager_api.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "revenues")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal value;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}