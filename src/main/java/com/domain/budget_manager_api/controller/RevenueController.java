package com.domain.budget_manager_api.controller;

import com.domain.budget_manager_api.controller.request.RevenueRequestDTO;
import com.domain.budget_manager_api.controller.response.RevenueResponse;
import com.domain.budget_manager_api.service.RevenueService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/budget-manager-api")
public class RevenueController {

    @Autowired
    private RevenueService revenueService;

    @PostMapping("/revenue")
    public ResponseEntity<RevenueResponse> createRevenue(@RequestBody @Valid RevenueRequestDTO revenue) {
        return ResponseEntity.ok(revenueService.saveRevenue(revenue));
    }
}