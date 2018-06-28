package com.example.sell.service;

import com.example.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductInfoService {
    Optional<ProductInfo> findOne(String productId);
    List<ProductInfo> findAll();
    //分页查询
    Page<ProductInfo> findAllPage(Pageable pageable);
    ProductInfo save(ProductInfo productInfo);
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
