package com.gabara.complaintservices.repositories;

import com.gabara.complaintservices.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
