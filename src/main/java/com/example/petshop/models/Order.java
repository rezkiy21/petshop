package com.example.petshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private int id;
    private int petId;
    private int quantity;
    private String shipDate;
    private Status status;
    private boolean complete;

    public enum Status{
        placed,
        approved,
        delivered
    };
}
