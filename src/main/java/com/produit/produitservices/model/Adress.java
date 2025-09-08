package com.produit.produitservices.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String street;
    private String city;
    private String state;
    private String zip;

    @ManyToOne
    @JoinColumn(name="id")
    private Person person;
}
