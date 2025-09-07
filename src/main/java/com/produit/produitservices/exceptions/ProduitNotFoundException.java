package com.produit.produitservices.exceptions;

public class ProduitNotFoundException extends RuntimeException {
    public ProduitNotFoundException(String message) {
        super(message);
    }
}
