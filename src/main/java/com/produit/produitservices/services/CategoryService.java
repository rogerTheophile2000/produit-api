package com.produit.produitservices.services;


import com.produit.produitservices.model.Category;
import com.produit.produitservices.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(long id) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if (optionalCategory.isPresent()) {
            return optionalCategory.get();
        }
        throw new RuntimeException("Category Not Found");
    }

    public Category addCategory(Category category) {
        return  categoryRepository.save(category);
    }

    public Category updateCategory(long id, Category category) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if (optionalCategory.isEmpty()) {
            throw new RuntimeException("Category Not Found");
        }
        Category updatedCategory = optionalCategory.get();
        updatedCategory.setName(category.getName());
        updatedCategory.setDescription(category.getDescription());

        return categoryRepository.save(updatedCategory);
    }

    public String deleteCategoryById(long id) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if (optionalCategory.isEmpty()) {
            throw new RuntimeException("Category Not Found");
        }
        categoryRepository.delete(optionalCategory.get());

        return "Category Deleted Successfully";
    }
}
