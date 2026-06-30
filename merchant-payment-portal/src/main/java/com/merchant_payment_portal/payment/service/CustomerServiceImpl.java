package com.merchant_payment_portal.payment.service;

import com.merchant_payment_portal.payment.entity.Customer;
import com.merchant_payment_portal.payment.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    public CustomerRepository repository;

    @Override
    public Customer createCustomer(Customer customer){
        if(repository.existsByCustomerNumber(customer.getCustomerNumber())){
            throw new RuntimeException("Customer Number is Already Exist");
        }
        return repository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers(){
        return repository.findAll();
    }

    @Override
    public Customer getCustomerById(Long id){
        return repository.findById(id).orElseThrow(()-> new RuntimeException("Customer ID Not Found"));
    }
}
