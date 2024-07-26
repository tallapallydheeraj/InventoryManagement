package com.learn.jerseys.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.jerseys.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

}
