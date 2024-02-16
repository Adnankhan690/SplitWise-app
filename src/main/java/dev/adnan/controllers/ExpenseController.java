package dev.adnan.controllers;

import dev.adnan.dtos.AddExpenseRequest;
import dev.adnan.service.ExpenseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/expense")
public class ExpenseController {

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    private final ExpenseService expenseService;



    @PostMapping(path = "/add")
    public Long addExpense(@RequestBody AddExpenseRequest request) {
        return expenseService.createExpense(request).getId();
    }

}
