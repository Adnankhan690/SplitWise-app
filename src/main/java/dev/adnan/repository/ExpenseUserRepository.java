package dev.adnan.repository;

import dev.adnan.models.ExpenseUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseUserRepository extends JpaRepository<ExpenseUser, Long> {
}
