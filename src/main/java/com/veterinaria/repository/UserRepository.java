package com.veterinaria.repository;

import com.veterinaria.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM users WHERE users.email = :filtro" ,nativeQuery = true)
    User findByEmail(@Param("filtro") String filtro);

    @Query(value = "SELECT * FROM users WHERE users.first_name = :filtro" ,nativeQuery = true)
    User findByUserName(@Param("filtro") String filtro);

    @Query(value = "SELECT * FROM users WHERE users.phone = :filtro" ,nativeQuery = true)
    User findByPhone(@Param("filtro") Integer filtro);

    @Query(value = "SELECT * FROM users WHERE users.id = :filtro" ,nativeQuery = true)
    Optional<User> findByID(@Param("filtro") Long filtro);

    @Query(value = "SELECT * FROM users WHERE users.soft_delete = true" ,nativeQuery = true)
    List<User> findBySoftDelete();

    @Query(value = "SELECT * FROM users WHERE users.soft_delete = true AND users.id = :filtro" ,nativeQuery = true)
    User findByiDAndsoftDelete(@Param("filtro") Long id);
}
