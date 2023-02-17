package com.example.demo.infrastructure.drivenAdapters.purchase;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface JpaPurchaseRepository extends JpaRepository<PurchaseEntity, Integer> {
    Optional<List<PurchaseEntity>> findByIdClient(String idClient);
}
