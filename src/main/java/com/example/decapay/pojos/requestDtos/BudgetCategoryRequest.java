package com.example.decapay.pojos.requestDtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString

public class BudgetCategoryRequest {
    @NotBlank(message ="Category name is required")
    private String name;
}