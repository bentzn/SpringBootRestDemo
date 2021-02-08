package com.bentzn.spring.boot.rest.services;

import java.util.List;

import com.bentzn.spring.boot.rest.model.Product;

public interface ProductService_i {

    
    Product find(int id);

    List<Product> findAll();


}
