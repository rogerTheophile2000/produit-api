package com.produit.produitservices.model;

import java.io.Serializable;

public record ErrorResponse(int status, String message) {
}
