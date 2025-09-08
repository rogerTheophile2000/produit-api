package com.produit.produitservices.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @ManyToMany(mappedBy = "categoryList")
    private List<Produit> produitList;
}
