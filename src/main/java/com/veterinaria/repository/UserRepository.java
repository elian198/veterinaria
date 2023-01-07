package com.veterinaria.repository;

import com.veterinaria.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM users WHERE users.email = :filtro" ,nativeQuery = true)
    User findByEmail(@Param("filtro") String filtro);

    @Query(value = "SELECT * FROM users WHERE users.first_name = :filtro" ,nativeQuery = true)
    User findByUserName(@Param("filtro") String filtro);

    @Query(value = "SELECT * FROM users WHERE users.phone = :filtro" ,nativeQuery = true)
    User findByPhone(@Param("filtro") Integer filtro);
}
