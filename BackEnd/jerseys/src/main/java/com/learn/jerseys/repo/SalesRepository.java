package com.learn.jerseys.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.jerseys.model.Sales;
@Repository
public interface SalesRepository extends JpaRepository<Sales, Integer> {

}
