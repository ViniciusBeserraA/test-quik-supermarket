package com.supermarket.supermarket.Model;
import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private BigDecimal balance;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<PurchaseOrder> orders;
}
