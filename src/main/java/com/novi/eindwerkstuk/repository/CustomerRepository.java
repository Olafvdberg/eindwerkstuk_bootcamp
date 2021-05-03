package com.novi.eindwerkstuk.repository;

import com.novi.eindwerkstuk.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
