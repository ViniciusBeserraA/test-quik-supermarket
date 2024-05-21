package com.supermarket.supermarket.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ClientDTO {
    private Long id;
    private String clientName;
    private String address;
    private BigDecimal balance;
    private List<String> orders;

    public ClientDTO(Long id, String clientName, String address, BigDecimal balance, List<String> orders) {
        this.id = id;
        this.clientName = clientName;
        this.address = address;
        this.balance = balance;
        this.orders = orders;
    }

    public ClientDTO() {

    }
}
