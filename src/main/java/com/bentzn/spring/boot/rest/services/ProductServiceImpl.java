package com.bentzn.spring.boot.rest.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.bentzn.spring.boot.rest.model.Product;

@Service
public class ProductServiceImpl implements ProductService_i {
    
    @Override
    public Product find(int a_nId) {
        return new Product(a_nId, "Product_name_" + a_nId);
    }

    @Override
    public List<Product> findAll() {
        List<Product> cProducts = new ArrayList<Product>();
        cProducts.add(new Product(100, "Mobile"));
        cProducts.add(new Product(101, "Smart TV"));
        cProducts.add(new Product(102, "Washing Machine"));
        cProducts.add(new Product(103, "Laptop"));
        cProducts.add(new Product(104, "Air Conditioner"));
        cProducts.add(new Product(105, "Refrigerator "));
        return cProducts;
    }
}
