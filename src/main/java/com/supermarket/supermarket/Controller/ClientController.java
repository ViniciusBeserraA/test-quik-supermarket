package com.supermarket.supermarket.Controller;
import com.supermarket.supermarket.Model.Client;
import com.supermarket.supermarket.Model.PurchaseOrder;
import com.supermarket.supermarket.dto.ClientDTO;
import com.supermarket.supermarket.dto.PurchaseOrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.supermarket.supermarket.Service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/")
    public List<ClientDTO> list() {
        List<Client> clients = clientService.list();
        return clientService.convertToDTO(clients);
    }
    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody PurchaseOrder storeOrder) {
        return ResponseEntity.ok(clientService.create(storeOrder));
    }
}