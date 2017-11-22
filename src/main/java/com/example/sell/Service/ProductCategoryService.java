package com.example.sell.Service;

import com.example.sell.domain.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
    ProductCategory findOne(Integer categoryid);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categorylist);

    ProductCategory save(ProductCategory productCategory);
}
