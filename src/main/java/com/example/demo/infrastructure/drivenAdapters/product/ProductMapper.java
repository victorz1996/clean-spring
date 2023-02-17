package com.example.demo.infrastructure.drivenAdapters.product;

import com.example.demo.domain.model.product.Product;
import com.example.demo.infrastructure.drivenAdapters.category.CategoryMapper;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "categoryId", target = "categoryId"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "stock", target = "stock"),
            @Mapping(source = "status", target = "status"),
            @Mapping(source = "category", target = "category"),
    })
    Product toProduct(ProductEntity productEntity);
    List<Product> toProducts(List<ProductEntity> productEntities);

    @InheritInverseConfiguration
    @Mapping(target = "barCode", ignore = true)
    ProductEntity toProductEntity(Product product);
}
