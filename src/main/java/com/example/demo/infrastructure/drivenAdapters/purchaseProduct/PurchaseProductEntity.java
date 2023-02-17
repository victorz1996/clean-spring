package com.example.demo.infrastructure.drivenAdapters.purchaseProduct;

import com.example.demo.infrastructure.drivenAdapters.product.ProductEntity;
import com.example.demo.infrastructure.drivenAdapters.purchase.PurchaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "compras_productos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class  PurchaseProductEntity {
    @EmbeddedId
    private PurchaseProductPK id;
    @Column(name = "cantidad")
    private Integer quantity;
    private Integer total;
    @Column(name = "estado")
    private  Boolean status;

    @ManyToOne
    @MapsId("idPurchase")
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private PurchaseEntity purchase;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private ProductEntity product;
}
