package com.learn.jerseys.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private long userId;
	@Column(name="name", nullable = false)
	private String name;
	@Column(name="username", nullable = false)
	private String username;
	@Column(name="password", nullable = false)
	private String password;
	@Column(name="is_active", nullable = false)
	private boolean isActive;
	@Column(name="userlevel", nullable = false)
	private String userlevel;
	@Column(name="created_datetime", nullable = false)
	private LocalDateTime createdDatetime;
	
	public long getUser_id() {
		return userId;
	}

	public void setUser_id(long user_id) {
		this.userId = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getUserlevel() {
		return userlevel;
	}

	public void setUserlevel(String userlevel) {
		this.userlevel = userlevel;
	}

	public LocalDateTime getCreated_datetime() {
		return createdDatetime;
	}

	public void setCreated_datetime(LocalDateTime created_datetime) {
		this.createdDatetime = created_datetime;
	}

	public User() {}

	public User(long user_id, String name, String username, String password, boolean isActive, String userlevel,
			LocalDateTime created_datetime) {
		super();
		this.userId = user_id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.isActive = isActive;
		this.userlevel = userlevel;
		this.createdDatetime = created_datetime;
	}
	
	
	
	
	  
}
