package com.supermarket.supermarket.Repository;

import com.supermarket.supermarket.Model.Client;
import com.supermarket.supermarket.Model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}