package com.docker.microservices.customer.customerapp.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "customer")
@Data
public class Customer {

    @Id
    private String id;
    private String name;
    private String surname;
    private List<Communication> communication;
}
