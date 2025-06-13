package com.example.dashfy.dto;

import java.time.LocalDate;

public class TransactionDTO {
    private Long id;
    private String type;
    private Double amount;
    private String description;
    private LocalDate date;

    public TransactionDTO(){}

    public TransactionDTO(String type, Double amount, String description) {
        this.type = type;
        this.amount = amount;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
