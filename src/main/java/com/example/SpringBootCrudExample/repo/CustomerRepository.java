package com.example.SpringBootCrudExample.repo;

import java.util.List;
import org.springframework.data.repository.*;
import com.example.SpringBootCrudExample.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByAge(int age);
}