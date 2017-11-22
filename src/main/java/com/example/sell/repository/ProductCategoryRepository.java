package com.example.sell.repository;

import com.example.sell.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{


    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypel);
}
