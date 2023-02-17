package com.example.demo.domain.model.category;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private Integer id;
    private String description;
    private Boolean active;
}
