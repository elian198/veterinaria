package com.veterinaria.repository;

import com.veterinaria.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Long> {

    @Query(value = "SELECT * FROM customers WHERE customers.email = :filtro" ,nativeQuery = true)
    Customer findByEmail(@Param("filtro") String filtro);

    @Query(value = "SELECT * FROM customers WHERE customers.first_name = :filtro" ,nativeQuery = true)
    Customer findByUserName(@Param("filtro") String filtro);

    @Query(value = "SELECT * FROM customers WHERE customers.phone = :filtro" ,nativeQuery = true)
    Customer findByPhone(@Param("filtro") Integer filtro);
}
