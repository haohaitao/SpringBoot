package com.example.sell.Service;

import com.example.sell.Service.Imp.ProductCategoryServiceImp;
import com.example.sell.domain.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

public class ProductCategoryServiceTest {
    @Autowired
    private ProductCategoryServiceImp productCategoryRespository;
    @Test
    public void findOne() throws Exception {
        Assert.assertNotNull(productCategoryRespository.findOne(4));
    }


    @Test
    public void findAll() throws Exception {
        Assert.assertNotNull(productCategoryRespository.findAll());
    }


    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer> list= Arrays.asList(2,4);
        Assert.assertNotNull(productCategoryRespository.findByCategoryTypeIn(list))
        ;
        }


    @Test
    public void save() throws Exception {
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryName("生活用品类");
        productCategory.setCategoryType(5);
        Assert.assertNotNull(productCategoryRespository.save(productCategory));

    }

}