package com.example.demo.infrastructure.drivenAdapters.client;

import com.example.demo.infrastructure.drivenAdapters.purchase.PurchaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientEntity {
    @Id
    private String id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "apellidos")
    private String lastName;
    @Column(name = "celular")
    private String phone;
    @Column(name = "direccion")
    private String address;
    @Column(name = "correo_electronico")
    private String email;

    @OneToMany(mappedBy = "client")
    private List<PurchaseEntity> purchases;
}
