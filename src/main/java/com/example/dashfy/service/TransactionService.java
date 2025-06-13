package com.example.dashfy.service;

import com.example.dashfy.dto.TransactionDTO;
import com.example.dashfy.model.Transaction;
import com.example.dashfy.repository.TransactionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private ConvertData convertData;

    @Transactional
    public Transaction addTransaction(TransactionDTO transactionDTO){
        Transaction transaction = convertData.toEntity(transactionDTO);
        return transactionRepository.save(transaction);
    }

    public List<TransactionDTO> findAllTransactions(){
        return convertData.toDTOList(transactionRepository.findAllTransactions());
    }
}
