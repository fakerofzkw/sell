package com.example.sell;


import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SellTest {

    @Test
    public void test1(){
        String name="zkw";
        String password="123456";
       log.debug("debug..........");
       log.info("name: {},password{}",name,password);
       log.error("error..........");
    }
}
