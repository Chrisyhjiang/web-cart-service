package com.webcart.project.com.webcart.project.service;

import com.webcart.project.model.Category;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{

    private List<Category> categories = new ArrayList<>();
    private long nextCategoryId = 1L;

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public void createCategory(Category category) {
        category.setCategoryId(nextCategoryId++);
        categories.add(category);
    }

    @Override
    public String deleteCategory(Long categoryId) {
        Category category = categories.stream()
                .filter( c -> c.getCategoryId() == categoryId)
                .findFirst().orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "resource not found"));
        categories.remove(category);
        return "delete of category with id: " + categoryId + " succeed";
    }

    @Override
    public Category updateCategory(Category category, Long categoryId) {
        Optional<Category> optionalCategory = categories.stream()
                .filter( c -> c.getCategoryId() == categoryId)
                .findFirst();
        if(optionalCategory.isPresent()){
            Category cg = optionalCategory.get();
            cg.setCategoryName(category.getCategoryName());
            return cg;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "category not found");
        }
    }


}
