package com.learn.jerseys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.jerseys.repo.SalesRepository;

@Service
public class SalesServiceImpl {

	@Autowired
	private SalesRepository salesRepository;
}
