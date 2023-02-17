package com.example.demo.infrastructure.drivenAdapters.purchase;

import com.example.demo.infrastructure.drivenAdapters.client.ClientEntity;
import com.example.demo.infrastructure.drivenAdapters.purchaseProduct.PurchaseProductEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer id;
    @Column(name = "id_cliente")
    private String idClient;
    @Column(name = "fecha")
    private LocalDateTime date;
    @Column(name = "medio_pago")
    private String typePayment;
    @Column(name = "comentario")
    private String comments;
    @Column(name = "estado")
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private ClientEntity client;

    @OneToMany(mappedBy = "purchase", cascade = {CascadeType.ALL})
    private List<PurchaseProductEntity> products;
}
