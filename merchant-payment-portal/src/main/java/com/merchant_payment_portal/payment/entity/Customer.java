package com.merchant_payment_portal.payment.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
@EntityListeners(AuditingEntityListener.class)

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="customer_number",nullable = false,unique = true)
    private String customerNumber;

    @Column(name="customer_name",nullable = false)
    private String customerName;

    @Column(name="customer_reg_date",nullable = false)
    private LocalDateTime customerRegDate;

    @Column(name="is_active",nullable = false)
    private Boolean isActive = true;
    @CreatedDate
    @Column(name="created_at",nullable = false,updatable = false)
    private LocalDateTime createdAt;
    @LastModifiedDate
    @Column(name="updated_at",nullable = false)
    private LocalDateTime updatedAt;

    public Customer(){

    }
    public Customer(String customerNumber, String customerName, LocalDateTime customerRegDate, Boolean isActive, LocalDateTime createdAt,LocalDateTime updatedAt){
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.customerRegDate = customerRegDate;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDateTime getCustomerRegDate() {
        return customerRegDate;
    }

    public void setCustomerRegDate(LocalDateTime customerRegDate) {
        this.customerRegDate = customerRegDate;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

}
