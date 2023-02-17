package com.example.demo.domain.model.purchaseItem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseItem {
    private Integer id;
    private Integer quantity;
    private Double total;
    private Boolean active;
}
