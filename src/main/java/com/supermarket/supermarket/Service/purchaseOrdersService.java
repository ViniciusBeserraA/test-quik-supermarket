package com.supermarket.supermarket.Service;

import com.supermarket.supermarket.Model.Client;
import com.supermarket.supermarket.Model.PurchaseOrder;
import com.supermarket.supermarket.Repository.ClientRepository;
import com.supermarket.supermarket.Repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class purchaseOrdersService {
    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    public List<PurchaseOrder> list(){
        return purchaseOrderRepository.findAll();
    }
    public String create(PurchaseOrder storeOrder){
        return null;
    }

}
