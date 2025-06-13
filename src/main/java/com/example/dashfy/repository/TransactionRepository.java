package com.example.dashfy.repository;

import com.example.dashfy.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    // Get all transactions
    @Query("SELECT t FROM Transaction t")
    List<Transaction> findAllTransactions();
}
