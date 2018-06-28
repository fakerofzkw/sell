package com.example.sell.dao;

import com.example.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

    //添加通过类目编号来查找
    //查找单个
    //List<ProductCategory> findByCategoryTypeIn(Integer categoryType);
    //查找多个
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
