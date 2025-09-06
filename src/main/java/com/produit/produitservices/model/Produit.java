package com.produit.produitservices.model;


import jakarta.persistence.*;
import lombok.*;

import java.io.File;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "produit")
public class Produit {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private double price;
    private String description;
    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
