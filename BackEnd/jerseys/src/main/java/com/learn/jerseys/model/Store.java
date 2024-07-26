package com.learn.jerseys.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stores")
public class Store {
	
	@Id
	@Column(name="store_id")
	private String storeId;
	@Column(name="store_name", nullable=false)
	private String storeName;
	@Column(name="location", nullable=false)
	private String location;
	@Column(name="address", nullable=false)
	private String address;
	@Column(name="store_timings", nullable=false)
	private String storeTimings;
	
	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStoreTimings() {
		return storeTimings;
	}

	public void setStoreTimings(String storeTimings) {
		this.storeTimings = storeTimings;
	}

	public Store() {
		
	}

	public Store(String storeId, String storeName, String location, String address, String storeTimings) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
		this.location = location;
		this.address = address;
		this.storeTimings = storeTimings;
	}
	

}
