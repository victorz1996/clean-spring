package com.example.demo.domain.model.purchase;

import com.example.demo.domain.model.purchaseItem.PurchaseItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {
    private Integer id;
    private String idClient;
    private LocalDateTime date;
    private String TypePayment;
    private String comments;
    private String status;

    private List<PurchaseItem> products;
}
