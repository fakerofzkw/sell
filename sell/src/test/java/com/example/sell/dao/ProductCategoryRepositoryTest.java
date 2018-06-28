package com.example.sell.dao;

import com.example.sell.dataobject.ProductCategory;
import org.hibernate.criterion.Example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;
    @Test
    public void findOneTest(){

//        ProductCategory productCategory=new ProductCategory();
//        productCategory.setCategoryId(1);
//        Example<ProductCategory> example=Example.of(productCategory);
//        System.out.print(repository.findOne(example));
        //查找id为1的数据
        System.out.println(repository.findById(1));
        System.out.println(repository.findById(1).get());
        System.out.println(repository.findById(1).toString());
        Optional<ProductCategory> productCategory=repository.findById(1);
        System.out.println(productCategory);
        System.out.println(productCategory.get());
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(22);
        ProductCategory result=repository.save(productCategory);
        //断言
        Assert.assertNotNull(result);
        //Assert.assertNotEquals(null,result);
    }

    @Test
    public void updataTest(){
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(21);
        repository.save(productCategory);
    }

    //通过单个类目编号来查询
//    @Test
//    public void findTestByType(){
//        List<ProductCategory> list=repository.findByCategoryTypeIn(10);
//         Iterator it=list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//    }
    //通过多个个类目编号来查询
    @Test
    public void findTestByTypes(){
        List<Integer> list=Arrays.asList(10,21);
        List<ProductCategory> lpc= repository.findByCategoryTypeIn(list);
        //加一个断言
        Assert.assertNotEquals(0,lpc);
        //遍历
        Iterator it=lpc.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
    }

    @Test
    public void findAllTest(){
        System.out.println(repository.findAll().toString());
    }
}