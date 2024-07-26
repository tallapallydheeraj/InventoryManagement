package com.learn.jerseys.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="sales")
public class Sales {

	@Id
	@Column(name="sale_id")
	private int saleId;
	@ManyToOne
	@JoinColumn(name="item_id")
	private Inventory item;
	@Column(name="price")
	private double price;
	@Column(name="quantity")
	private int quantity;
	@ManyToOne
	@JoinColumn(name="store_id")
	private Store store;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public Inventory getItem() {
		return item;
	}

	public void setItem(Inventory item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Sales() {
		
	}

	public Sales(int saleId, Inventory item, double price, int quantity, Store store, User user) {
		super();
		this.saleId = saleId;
		this.item = item;
		this.price = price;
		this.quantity = quantity;
		this.store = store;
		this.user = user;
	}

	
	
}
