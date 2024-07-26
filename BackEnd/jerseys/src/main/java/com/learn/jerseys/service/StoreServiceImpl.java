package com.learn.jerseys.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.jerseys.model.Store;
import com.learn.jerseys.repo.StoreRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class StoreServiceImpl implements StoreService{

	@Autowired
	private StoreRepository storeRepository;

	public Store getStoreById(String id) {
		try {
			Optional<Store> store = this.storeRepository.findById(id);
			return store.orElseThrow(()->{return new EntityNotFoundException("Store with "+id+" does not exist");});
			
		}catch (IllegalArgumentException e) {
			return null;
		}
	}

	@Override
	public Store saveStore(Store store) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Store> getAllStores() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Store updateStore(Store Store) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStore(Long id) {
		// TODO Auto-generated method stub
		
	}
}
