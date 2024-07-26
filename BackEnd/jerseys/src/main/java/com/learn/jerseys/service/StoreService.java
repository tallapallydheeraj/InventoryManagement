package com.learn.jerseys.service;

import java.util.List;

import com.learn.jerseys.model.Store;

public interface StoreService {
	Store saveStore(Store store);
    List<Store> getAllStores();
    Store getStoreById(String id);
    Store updateStore(Store Store);
    void deleteStore(Long id);
}
