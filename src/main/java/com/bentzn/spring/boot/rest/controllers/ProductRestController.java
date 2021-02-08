package com.bentzn.spring.boot.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bentzn.spring.boot.rest.model.Product;
import com.bentzn.spring.boot.rest.services.ProductService_i;

@RestController
@RequestMapping(value = "/products")
public class ProductRestController {

    @Autowired
    private ProductService_i m_cProductService;

    @GetMapping("/")
    public List<Product> getAll() {
        return m_cProductService.findAll();
    }



    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") int a_nId) {
        return m_cProductService.find(a_nId);
    }



    @PostMapping("/")
    public Product createProduct(@RequestBody Product a_cProduct) {
        a_cProduct.setId(9999);
        return a_cProduct;
    }
}
