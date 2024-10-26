package com.domain.budget_manager_api.service;

import com.domain.budget_manager_api.controller.request.RevenueRequestDTO;
import com.domain.budget_manager_api.controller.response.RevenueResponse;
import com.domain.budget_manager_api.model.Revenue;
import com.domain.budget_manager_api.repository.RevenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RevenueService {

    @Autowired
    private RevenueRepository revenueRepository;

    public RevenueResponse saveRevenue(RevenueRequestDTO revenueRequestDTO) {
        Revenue revenue = revenueRepository.save(revenueRequestDTO.toEntity());
        return new RevenueResponse(revenue.getId(), revenue.getDescription(), revenue.getValue(), revenue.getDate());
    }
}