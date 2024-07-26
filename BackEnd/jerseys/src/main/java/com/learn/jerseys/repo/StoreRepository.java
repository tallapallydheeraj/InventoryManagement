package com.learn.jerseys.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.jerseys.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, String> {

}
