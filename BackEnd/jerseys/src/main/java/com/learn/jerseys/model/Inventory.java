package com.learn.jerseys.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="inventory")
public class Inventory {

	@Id
	@Column(name="item_id")
	private int itemId;
	@Column(name="item_name", nullable=false)
	private String itemName;
	@Column(name="item_type", nullable=false)
	private String itemType;
	@Column(name="size", nullable=false)
	private String size;
	@Column(name="quantity", nullable=false)
	private int quantity;
	@ManyToOne
	@JoinColumn(name="store_id")
	private Store store;
	
	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Inventory() {
		
	}

	public Inventory(int itemId, String itemName, String itemType, String size, int quantity, Store store) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.size = size;
		this.quantity = quantity;
		this.store = store;
	}
	
	

}
