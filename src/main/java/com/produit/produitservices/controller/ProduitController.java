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

    @GetMapping("/produits/")
    public List<Produit> getAllProduits(){
        return  produitService.getAllProduits();
    }

    @PostMapping
    public Produit addProduit(@RequestBody Produit produit){
        return produitService.createProduit(produit);
    }

    @GetMapping("/{id}")
    public Produit getProduitById(@PathVariable long id){
        return produitService.getProduitById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProduitById(@PathVariable("id") long idProduit){
        return produitService.deleteProduitById(idProduit);
    }

    @PutMapping("{id}")
    public Produit updateProduitById(@PathVariable("id") long idProduit, @RequestBody Produit produit){
        return produitService.updateProduit(idProduit, produit);
    }
}
