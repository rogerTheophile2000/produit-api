package com.produit.produitservices.controller;


import com.produit.produitservices.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PersonController {
    private final PersonService  personService;

//    @GetMapping("")
}
