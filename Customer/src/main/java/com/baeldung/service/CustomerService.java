package com.baeldung.service;

import com.baeldung.model.Customer;
import com.baeldung.form.CustomerSearchForm;

import java.util.Optional;

public interface CustomerService {

    Customer createCustomer(Customer customer);

//fred
    int searchCustomer(CustomerSearchForm customerSearchForm);

    Optional<Customer> findCustomer(String id);

    void updateCustomer(Customer customer);

    
}
