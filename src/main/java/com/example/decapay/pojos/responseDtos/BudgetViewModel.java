package com.example.decapay.pojos.responseDtos;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class BudgetViewModel {
    private Long budgetId;
    private int totalBudgets;
    private BigDecimal amount;
    private BigDecimal totalAmountSpent;
    private BigDecimal percentage;
    private List<LineItemRest> lineItemRests;
}
