package com.example.demo.infrastructure.drivenAdapters.purchase;

import com.example.demo.domain.model.purchase.Purchase;
import com.example.demo.infrastructure.drivenAdapters.purchaseProduct.PurchaseItemMapper;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {
    @Mappings({
    })
    Purchase toPurchase(PurchaseEntity purchaseEntity);
    List<Purchase> toPurchases(List<PurchaseEntity> purchaseEntities);

    @InheritInverseConfiguration
    @Mapping(target = "client", ignore = true)
    PurchaseEntity toPurchaseEntity(Purchase purchase);
}
