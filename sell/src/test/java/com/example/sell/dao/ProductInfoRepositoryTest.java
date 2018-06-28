package com.example.sell.dao;

import com.example.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void findOneTest(){
        repository.findById("1");
    }

    @Test
    public void saveTest(){
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductId("101");
        productInfo.setProductName("小米手机");
        productInfo.setProductPrice(new BigDecimal(1999.9));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("为发烧而生");
        productInfo.setProductIcon("www.***.com");
        productInfo.setProductStatus(1);
        productInfo.setCategoryType(1);
        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void  findByProductStatus(){
        List<ProductInfo> li= repository.findByProductStatusIn(1);
        Assert.assertNotEquals(0,li);
    }
}