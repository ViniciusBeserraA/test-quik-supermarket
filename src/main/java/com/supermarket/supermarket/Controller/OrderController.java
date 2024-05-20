package com.supermarket.supermarket.Controller;

import com.supermarket.supermarket.Model.PurchaseOrder;
import com.supermarket.supermarket.Service.purchaseOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchaseOrders")
public class OrderController {
    @Autowired
    purchaseOrdersService purchaseOrders;

    @GetMapping("/")
    public ResponseEntity<?> list() {
        return ResponseEntity.ok(purchaseOrders.list());
    }
    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody PurchaseOrder storeOrder) {
        return ResponseEntity.ok(purchaseOrders.create(storeOrder));
    }
}
