package com.docker.microservices.product.productapp.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
@Data
public class Product {
    @Id
    private String id;
    private String productCode;
    private String productDescription;
}
