package com.example.dashfy.service;

import com.example.dashfy.dto.TransactionDTO;
import com.example.dashfy.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConvertData {

    public List<Transaction> toEntityList(List<TransactionDTO> transactionDTO){
        return transactionDTO.stream()
                .map(t -> new Transaction(
                        t.getId(),
                        t.getType(),
                        t.getAmount(),
                        t.getDescription(),
                        t.getDate()
                ))
                .collect(Collectors.toList());
    }

    public List<TransactionDTO> toDTOList(List<Transaction> transaction){
        return transaction.stream()
                .map(t -> new TransactionDTO(
                        t.getType(),
                        t.getAmount(),
                        t.getDescription()
                ))
                .collect(Collectors.toList());
    }


    public Transaction toEntity(TransactionDTO transactionDTO){
        return new Transaction(
                transactionDTO.getId(),
                transactionDTO.getType(),
                transactionDTO.getAmount(),
                transactionDTO.getDescription(),
                transactionDTO.getDate()
        );
    }

    public TransactionDTO toDTO(Transaction transaction){
        return new TransactionDTO(
                transaction.getType(),
                transaction.getAmount(),
                transaction.getDescription()
        );
    }
}
