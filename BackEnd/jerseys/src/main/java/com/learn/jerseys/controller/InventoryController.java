package com.learn.jerseys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.jerseys.model.Inventory;
import com.learn.jerseys.service.InventoryServiceImpl;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

	@Autowired
	private InventoryServiceImpl inventoryService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getItemById(@PathVariable Integer id){
		try {
			Inventory item=this.inventoryService.findById(id);
			return ResponseEntity.status(HttpStatus.OK)
					.body(item);
		}
		catch (EntityNotFoundException e) {
			System.out.println("error");
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("Item not found");
		}
	}
	
}
