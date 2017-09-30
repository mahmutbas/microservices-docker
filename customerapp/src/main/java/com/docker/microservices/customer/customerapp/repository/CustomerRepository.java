package com.docker.microservices.customer.customerapp.repository;

import com.docker.microservices.customer.customerapp.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
