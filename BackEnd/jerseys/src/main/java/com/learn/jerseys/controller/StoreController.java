package com.learn.jerseys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.jerseys.model.Inventory;
import com.learn.jerseys.model.Store;
import com.learn.jerseys.service.StoreService;
import com.learn.jerseys.service.StoreServiceImpl;

import jakarta.persistence.EntityNotFoundException;

@RestController
@CrossOrigin("*")
@RequestMapping("/store")
public class StoreController {
	
	@Autowired
	private StoreService storeService;

	@GetMapping("/{id}")
	public ResponseEntity<Object> getStoreById(@PathVariable String id) {
		try {
			Store store=this.storeService.getStoreById(id.toUpperCase());
			return ResponseEntity.status(HttpStatus.OK)
					.body(store);
		}
		catch (EntityNotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("Store not found");
		}
	}
	
}
