package com.produit.produitservices.repository;

import com.produit.produitservices.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
