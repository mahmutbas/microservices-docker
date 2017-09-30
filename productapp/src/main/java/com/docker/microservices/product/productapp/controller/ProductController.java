package com.docker.microservices.product.productapp.controller;

import com.docker.microservices.product.productapp.model.Product;
import com.docker.microservices.product.productapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Product addProduct(@RequestBody Product product) {

        Product result = productRepository.save(product);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{productId}")
    public Product getProduct(@PathVariable String productId) {
        return productRepository.findOne(productId);
    }
}
