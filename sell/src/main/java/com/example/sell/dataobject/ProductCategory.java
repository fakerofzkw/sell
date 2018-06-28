package com.example.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

//类目表
@Entity
//更新date
@DynamicUpdate
@Data       //加这个注解之后就不用写get和set，以及toString方法
public class ProductCategory {

    //类目id
    @Id       //主键
    @GeneratedValue    //自增
    private Integer  categoryId;

    //类目名字
    private String categoryName;

    //类目编号
    private Integer categoryType;

    //创建时间
    //private Date createTime;

    //更新时间
    //private Date updateTime;


}
