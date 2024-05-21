package com.supermarket.supermarket.Service;

import com.supermarket.supermarket.dto.PurchaseOrderDTO;
import com.supermarket.supermarket.Model.PurchaseOrder;
import com.supermarket.supermarket.Repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PurchaseOrderService {
    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;
    private PurchaseOrderDTO purchaseOrderDTO;

    public PurchaseOrderDTO convertToDTO(PurchaseOrder purchaseOrder) {
        PurchaseOrderDTO dto = new PurchaseOrderDTO();
        dto.setOrderNumber(purchaseOrder.getOrderNumber());
        dto.setPromotionApplication(purchaseOrder.getPromotionApplication());
        dto.setDescription(purchaseOrder.getDescription());
        dto.setClientName(purchaseOrder.getClient().getName());
        dto.setClientId(purchaseOrder.getClient().getId());
        dto.setStatus(purchaseOrder.getStatus());
        return dto;
    }
    public List<PurchaseOrderDTO> convertToDTO(List<PurchaseOrder> purchaseOrders) {
        return purchaseOrders.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public List<PurchaseOrder> list(){
        return purchaseOrderRepository.findAll();
    }
    public String create(PurchaseOrder storeOrder){
        return null;
    }

    public List<String> findOrdersByClientId(Long clientId) {
        return purchaseOrderRepository.findOrderNumbersByClientId(clientId);
    }

}
