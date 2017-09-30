package com.docker.microservices.product.productapp.repository;

import com.docker.microservices.product.productapp.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
