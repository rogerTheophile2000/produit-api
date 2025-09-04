package com.produit.produitservices.controller;


import com.produit.produitservices.model.Produit;
import com.produit.produitservices.services.ProduitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produits/")
@RequiredArgsConstructor
public class ProduitController {
    private final ProduitService produitService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/produits/")
    public List<Produit> getAllProduits(){
        return  produitService.getAllProduits();
    }

    @PostMapping
    public Produit addProduit(@RequestBody Produit produit){
        return produitService.createProduit(produit);
    }
}
