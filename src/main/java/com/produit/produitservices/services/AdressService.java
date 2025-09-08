package com.produit.produitservices.services;


import com.produit.produitservices.repository.AdressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdressService {

    private final AdressRepository adressRepository;
}
