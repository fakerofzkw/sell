package com.example.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

//商品信息表
@Entity
@Data
public class ProductInfo {

    @Id //主键
    private String productId;
    //商品名称
    private String productName;
    //商品单价
    private BigDecimal productPrice;
    //库存
    private Integer productStock;
    //描述
    private String productDescription;
    //图片
    private String productIcon;
    //商品状态,0正常1下架
    private Integer productStatus;
    //类目编号
    private Integer categoryType;

    //创建时间
    //private Date createTime;
    //更新时间
    //private Date updateTime;

}
