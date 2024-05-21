package com.supermarket.supermarket.Repository;

import com.supermarket.supermarket.Model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {

    @Query("SELECT po.orderNumber FROM PurchaseOrder po WHERE po.client.id =:clientId")
    List<String> findOrderNumbersByClientId(Long clientId);

}