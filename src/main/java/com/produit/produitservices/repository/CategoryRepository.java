package com.produit.produitservices.repository;

import com.produit.produitservices.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
