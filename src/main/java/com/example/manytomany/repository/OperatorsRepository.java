package com.example.manytomany.repository;

import com.example.manytomany.model.Operators;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatorsRepository extends JpaRepository<Operators,Long> {
}