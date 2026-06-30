package com.merchant_payment_portal.payment.repository;

import com.merchant_payment_portal.payment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
        boolean existsByCustomerNumber(String customerNumber);
}
