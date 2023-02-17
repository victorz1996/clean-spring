package com.example.demo.domain.usecase.purchase;

import com.example.demo.domain.model.purchase.Purchase;
import com.example.demo.domain.model.purchase.gateways.PurchaseRepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class GetPurchasesByClientUseCase {
    private final PurchaseRepository purchaseRepository;

    public Optional<List<Purchase>> getPurchasesByClient(String clientId){
        return purchaseRepository.getByClient(clientId);
    }
}
