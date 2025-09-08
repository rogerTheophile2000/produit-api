package com.produit.produitservices.model;


import jakarta.persistence.*;
import lombok.*;

import java.io.File;
import java.util.List;

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

    @ManyToMany(mappedBy = "produitList")
    @JoinTable(
            name = "product_category",
            joinColumns = @JoinColumn(name= "id"),
            inverseJoinColumns = @JoinColumn(name = "id")
    )
    private List<Category> categoryList;
}
