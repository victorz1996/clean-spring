package com.example.demo.domain.usecase.purchase;

import com.example.demo.domain.model.purchase.Purchase;
import com.example.demo.domain.model.purchase.gateways.PurchaseRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GetAllPurchasesUseCase {
    private final PurchaseRepository purchaseRepository;

    public List<Purchase> getAll(){
        return purchaseRepository.getAll();
    }
}
