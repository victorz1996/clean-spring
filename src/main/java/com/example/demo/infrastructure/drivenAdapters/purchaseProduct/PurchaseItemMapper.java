package com.example.demo.infrastructure.drivenAdapters.purchaseProduct;

import com.example.demo.domain.model.purchaseItem.PurchaseItem;
import com.example.demo.infrastructure.drivenAdapters.product.ProductMapper;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {
    @Mappings({
            @Mapping(source = "id.idProduct", target = "id"),
            @Mapping(source = "status", target = "active"),
    })
    PurchaseItem toPurchaseItem(PurchaseProductEntity purchaseProductEntity);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "purchase", ignore = true),
            @Mapping(target = "product", ignore = true),
            @Mapping(target = "id.idPurchase", ignore = true)
    })
    PurchaseProductEntity toPurchaseProductEntity(PurchaseItem purchaseItem);
}
