package com.example.sell.service.impl;

import com.example.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        Optional<ProductCategory> productCategory=categoryService.findOne(1);

        Assert.assertEquals(new Integer(1),productCategory.get().getCategoryId());
        //Assert.assertEquals(1,Optional.ofNullable(productCategory.get().getCategoryId()));
        //Assert.assertEquals(Optional.of(1),productCategory.get().getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategoryList=categoryService.findAll();
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> ls= Arrays.asList(10,22);
        List<ProductCategory> productCategoryList2=categoryService.findByCategoryTypeIn(ls);
        Assert.assertNotEquals(0,productCategoryList2.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryName("特惠专区");
        productCategory.setCategoryType(11);
        ProductCategory result=categoryService.save(productCategory);
        Assert.assertNotNull(result);
    }
}