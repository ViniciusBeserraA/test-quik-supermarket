package com.supermarket.supermarket.Model;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderNumber;
    private String description;
    private Boolean promotionApplication;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

}
