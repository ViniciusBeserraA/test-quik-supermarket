package com.supermarket.supermarket.dto;

import lombok.Data;
@Data
public class PurchaseOrderDTO {
    private String orderNumber;
    private String description;
    private Boolean promotionApplication;
    private Long clientId;
    private String clientName;
    private String status;


    public PurchaseOrderDTO(String orderNumber, String description, Boolean promotionApplication, Long clientId, String clientName, String status) {
        this.orderNumber = orderNumber;
        this.description = description;
        this.promotionApplication = promotionApplication;
        this.clientId = clientId;
        this.clientName = clientName;
        this.status = status;
    }

    public PurchaseOrderDTO() {

    }
}
