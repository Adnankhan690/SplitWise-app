package dev.adnan.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Expense extends BaseModel {
    private String name;
    @Enumerated(EnumType.STRING)
    private ExpenseType type;
    private double totalAmount;


    // who all paid in this expense.
    @ManyToOne
    private Group group;

    @OneToMany
    private List<ExpenseUser> paidBy;
    @OneToMany
    private List<ExpenseUser> owedBy;
    // who all owe some amount in the expense.
}
