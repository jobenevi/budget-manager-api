package com.domain.budget_manager_api.controller.response;


import java.math.BigDecimal;
import java.time.LocalDate;

public record RevenueResponse(Long id, String description, BigDecimal value, LocalDate date) {

}
