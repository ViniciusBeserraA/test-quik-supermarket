package com.supermarket.supermarket.Controller;

import com.supermarket.supermarket.dto.PurchaseOrderDTO;
import com.supermarket.supermarket.Model.PurchaseOrder;
import com.supermarket.supermarket.Service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchaseOrders")
public class OrderController {
    @Autowired
    PurchaseOrderService purchaseOrdersService;

    @GetMapping("/")
    public List<PurchaseOrderDTO> list() {
        List<PurchaseOrder> orders = purchaseOrdersService.list();
        return purchaseOrdersService.convertToDTO(orders);
    }
    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody PurchaseOrder storeOrder) {
        return ResponseEntity.ok(purchaseOrdersService.create(storeOrder));
    }
}
