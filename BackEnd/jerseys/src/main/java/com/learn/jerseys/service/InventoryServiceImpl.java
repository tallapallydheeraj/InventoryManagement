package com.learn.jerseys.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.jerseys.model.Inventory;
import com.learn.jerseys.repo.InventoryRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class InventoryServiceImpl {

	@Autowired
	private InventoryRepository inventoryRepository;

	public Inventory findById(Integer id) {
		try {
			Optional<Inventory> area = this.inventoryRepository.findById(id);
			return area.orElseThrow(()->{return new EntityNotFoundException("Area with "+id+" does not exist");});
			
		}catch (IllegalArgumentException e) {
			return null;
		}
	}
}
