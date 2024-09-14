package com.webcart.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.webcart.project.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
