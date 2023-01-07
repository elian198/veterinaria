package com.veterinaria.repository;

import com.veterinaria.entities.Turn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnRepository  extends JpaRepository<Turn, Long> {
}
