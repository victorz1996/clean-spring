package com.example.demo.domain.usecase.purchase;

import com.example.demo.domain.model.purchase.Purchase;
import com.example.demo.domain.model.purchase.gateways.PurchaseRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SavePurchaseUseCase {
    private final PurchaseRepository purchaseRepository;

    public Purchase savePurchase(Purchase purchase){
        return purchaseRepository.save(purchase);
    }
}
