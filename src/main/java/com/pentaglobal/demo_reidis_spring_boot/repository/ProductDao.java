package com.pentaglobal.demo_reidis_spring_boot.repository;


import com.pentaglobal.demo_reidis_spring_boot.entity.Product;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDao {


    private static final Object HASH_KEY = "Product";
    public RedisTemplate template;

    public Product save(Product product){
        template.opsForHash().put(HASH_KEY,product.getId(),product);
    return product;
    }

    public List<Product> getAllProduct(){
        return template.opsForHash().values(HASH_KEY);
    }

    public Product getProductById(int id){
        return (Product) template.opsForHash().get(HASH_KEY,id);
    }

    public String deleteProductById(int id){
        template.opsForHash().delete(HASH_KEY,id);
        return "product deleted";
    }


}
