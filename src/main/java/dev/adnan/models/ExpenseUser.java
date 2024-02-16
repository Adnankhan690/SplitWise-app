package dev.adnan.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseUser extends BaseModel{
    @ManyToOne
    private User user;
    private Double amount;
}
