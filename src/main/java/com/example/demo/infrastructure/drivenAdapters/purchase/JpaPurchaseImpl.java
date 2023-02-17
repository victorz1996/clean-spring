package com.example.demo.infrastructure.drivenAdapters.purchase;

import com.example.demo.domain.model.purchase.Purchase;
import com.example.demo.domain.model.purchase.gateways.PurchaseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class JpaPurchaseImpl implements PurchaseRepository {
    private final JpaPurchaseRepository jpaPurchaseRepository;
    private final PurchaseMapper purchaseMapper;

    @Override
    public List<Purchase> getAll() {
        return purchaseMapper.toPurchases(jpaPurchaseRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return jpaPurchaseRepository.findByIdClient(clientId)
                .map(purchaseMapper::toPurchases);
    }

    @Override
    public Purchase save(Purchase purchase) {
        PurchaseEntity purchaseEntity = purchaseMapper.toPurchaseEntity(purchase);
        purchaseEntity.getProducts().forEach(purchaseProductEntity -> purchaseProductEntity.setPurchase(purchaseEntity));
        return purchaseMapper.toPurchase(jpaPurchaseRepository.save(purchaseEntity));
    }
}
