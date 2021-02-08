package com.bentzn.spring.boot.rest;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.bentzn.spring.boot.rest.model.Product;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class SpringBootRestExampleApplicationTests {

    @LocalServerPort
    private int m_nPort;

    @Test
    void testGet() {
        RestTemplate cRestTemplate = new RestTemplate();
        Product cProduct = cRestTemplate.getForObject("http://localhost:" + m_nPort + "/products/123", Product.class);
        assertNotNull(cProduct);
        assertEquals("Product_name_123", cProduct.getName());
    }

    @Test
    void testPost() {
        RestTemplate cRestTemplate = new RestTemplate();
        Product cProduct = new Product(0, "new_product");
        ResponseEntity<Product> cResponse = cRestTemplate.postForEntity("http://localhost:" + m_nPort + "/products/", cProduct, Product.class);
        assertEquals(9999, cResponse.getBody().getId());
    }
}
