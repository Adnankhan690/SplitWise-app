package dev.adnan.dtos;

import dev.adnan.models.ExpenseType;
import lombok.Data;

import java.util.Map;

@Data
public class AddExpenseRequest {
    private String name;
    private ExpenseType expenseType;
    private Double totalAmount;
    private Map<Long, Double> paidBy;
    private Map<Long, Double> owedBy;
}
