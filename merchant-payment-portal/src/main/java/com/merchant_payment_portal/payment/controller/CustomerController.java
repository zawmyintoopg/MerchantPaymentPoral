package com.merchant_payment_portal.payment.controller;

import com.merchant_payment_portal.payment.entity.Customer;
import com.merchant_payment_portal.payment.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping
    public Customer create(@RequestBody Customer customer){
        return service.createCustomer(customer);
    }

    @GetMapping
    public List<Customer> allCustomers(){
        return service.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return service.getCustomerById(id);
    }

}
