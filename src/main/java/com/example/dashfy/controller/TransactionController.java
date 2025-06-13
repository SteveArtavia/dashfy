package com.example.dashfy.controller;

import com.example.dashfy.dto.TransactionDTO;
import com.example.dashfy.model.Transaction;
import com.example.dashfy.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<TransactionDTO> addTransaction(@RequestBody TransactionDTO transactionDTO){
        transactionService.addTransaction(transactionDTO);
        return new ResponseEntity<>(transactionDTO, HttpStatus.CREATED);
    }

    @GetMapping()
    public List<TransactionDTO> findAllTransactions(){
        return transactionService.findAllTransactions();
    }
}
