package com.example.demo.infrastructure.drivenAdapters.product;

import com.example.demo.infrastructure.drivenAdapters.category.CategoryEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "productos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", nullable = false)
    private Integer id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "id_categoria")
    private Integer categoryId;
    @Column(name = "codigo_barras")
    private String barCode;
    @Column(name = "precio_venta")
    private Double price;
    @Column(name = "cantidad_stock")
    private Integer stock;
    @Column(name = "estado")
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private CategoryEntity category;
}
