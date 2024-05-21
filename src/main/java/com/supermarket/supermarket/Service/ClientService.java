package com.supermarket.supermarket.Service;

import com.supermarket.supermarket.Model.Client;
import com.supermarket.supermarket.Model.PurchaseOrder;
import com.supermarket.supermarket.Repository.ClientRepository;
import com.supermarket.supermarket.dto.ClientDTO;
import com.supermarket.supermarket.dto.PurchaseOrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private PurchaseOrderService purchaseOrderService;

    public ClientDTO convertToDTO(Client client) {
        ClientDTO dto = new ClientDTO();
        dto.setId(client.getId());
        dto.setClientName(client.getName());
        dto.setBalance(client.getBalance());
        List<String> orders = purchaseOrderService.findOrdersByClientId(client.getId());
        dto.setOrders(orders);

        return dto;
    }
    public List<ClientDTO> convertToDTO(List<Client> clients) {
        return clients.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public List<Client> list(){
        return clientRepository.findAll();
    }
    public String create(PurchaseOrder storeOrder){
        return null;
    }

}
