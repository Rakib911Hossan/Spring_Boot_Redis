package com.pentaglobal.demo_reidis_spring_boot.entity;


import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Product")
public class Product {

    private int id;
    private String name;
    private int qty;
    private  long price;
}
