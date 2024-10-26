package com.domain.budget_manager_api.controller.request;

import com.domain.budget_manager_api.model.Revenue;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RevenueRequestDTO {

    @NotNull
    private String description;
    @NotNull
    private BigDecimal value;
    @NotNull
    private LocalDate date;


    public RevenueRequestDTO(String description, BigDecimal value, LocalDate date) {
        this.description = description;
        this.value = value;
        this.date = date;
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


    public Revenue toEntity() {
        return new Revenue(description, value, date);
    }

}
