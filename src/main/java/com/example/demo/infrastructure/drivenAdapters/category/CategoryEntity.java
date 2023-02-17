package com.example.demo.infrastructure.drivenAdapters.category;

import com.example.demo.infrastructure.drivenAdapters.product.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer id;
    @Column(name = "descripcion")
    private String description;
    @Column(name = "estado")
    private Boolean status;

    @OneToMany(mappedBy = "category")
    private List<ProductEntity> products;

}
