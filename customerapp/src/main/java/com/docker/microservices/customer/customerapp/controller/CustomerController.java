package com.docker.microservices.customer.customerapp.controller;

import com.docker.microservices.customer.customerapp.model.Customer;
import com.docker.microservices.customer.customerapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Customer addCustomer(@RequestBody Customer customer) {

        Customer result = customerRepository.save(customer);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{customerId}")
    public Customer getCustomer(@PathVariable String customerId) {
        return customerRepository.findOne(customerId);
    }
}
