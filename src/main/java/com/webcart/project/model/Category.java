package com.webcart.project.model;

public class Category {
    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public Category(long categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    private long categoryId;

    public String getCategoryName() {
        return categoryName;
    }

    public long getCategoryId() {
        return categoryId;
    }

    private String categoryName;

}
