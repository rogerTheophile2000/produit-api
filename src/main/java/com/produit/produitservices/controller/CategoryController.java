package com.produit.produitservices.controller;


import com.produit.produitservices.model.Category;
import com.produit.produitservices.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produits/")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/categories/")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/categories/{id}/")
    public Category getCategoryById(@PathVariable("id") long id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping("/categories/")
    public Category addCategory(@RequestBody Category category) {
        return  categoryService.addCategory(category);
    }

    @PutMapping("/categories/{id}/")
    public Category updateCategoryById(@PathVariable("id") long id, @RequestBody Category category) {
        return categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/categories/{id}/")
    public String deleteCategoryById(@PathVariable("id") long id) {
        return  categoryService.deleteCategoryById(id);
    }

}
