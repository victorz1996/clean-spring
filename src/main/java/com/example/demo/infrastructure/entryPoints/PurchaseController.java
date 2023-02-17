package com.example.demo.infrastructure.entryPoints;

import com.example.demo.domain.model.purchase.Purchase;
import com.example.demo.domain.usecase.purchase.GetAllPurchasesUseCase;
import com.example.demo.domain.usecase.purchase.GetPurchasesByClientUseCase;
import com.example.demo.domain.usecase.purchase.SavePurchaseUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
@AllArgsConstructor
public class PurchaseController {
    private final GetAllPurchasesUseCase getAllPurchasesUseCase;
    private final SavePurchaseUseCase savePurchaseUseCase;

    private final GetPurchasesByClientUseCase getPurchasesByClientUseCase;
    @GetMapping
    public ResponseEntity<List<Purchase>> getAllPurchases(){
        return new ResponseEntity<>(getAllPurchasesUseCase.getAll(), HttpStatus.OK);
    }

    @GetMapping("client/{clientId}")
    public ResponseEntity<List<Purchase>> getPurchasesByClient(@PathVariable("clientId") String idClient){
        return getPurchasesByClientUseCase.getPurchasesByClient(idClient).map(purchases -> new ResponseEntity<>(purchases, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping
    public ResponseEntity<Purchase> createPurchase(@RequestBody Purchase purchase){
        return new ResponseEntity<>(savePurchaseUseCase.savePurchase(purchase), HttpStatus.CREATED);
    }
}
