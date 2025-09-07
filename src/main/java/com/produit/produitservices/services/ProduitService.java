package com.produit.produitservices.services;

import com.produit.produitservices.exceptions.ProduitNotFoundException;
import com.produit.produitservices.model.Produit;
import com.produit.produitservices.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProduitService {
    private final ProduitRepository produitRepository;

    public List<Produit> getAllProduits() {
        return  produitRepository.findAll();
    }

    public Produit createProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    public Produit getProduitById(long id) {
        Optional<Produit> optional = produitRepository.findById(id);
        if(optional.isEmpty()){
            throw new ProduitNotFoundException("Produit not found");
        }
        return optional.get();
    }

    public String deleteProduitById(long idProduit) {
        Optional<Produit> optionalProduit = produitRepository.findById(idProduit);
        if(optionalProduit.isEmpty()){
            throw new ProduitNotFoundException("Can not delete : Produit not found");
        }
        produitRepository.delete(optionalProduit.get());

        return "Product deleted successfully";
    }

    public Produit updateProduit(long idProduit, Produit produit) {
        Optional<Produit> optionalProduit = produitRepository.findById(idProduit);
        if(optionalProduit.isEmpty()){
            throw new ProduitNotFoundException("Can not update : Produit not found");
        }

        Produit updateProduit = optionalProduit.get();
        updateProduit.setName(produit.getName());
        updateProduit.setPrice(produit.getPrice());
        updateProduit.setDescription(produit.getDescription());

        return produitRepository.save(updateProduit);
    }
}
