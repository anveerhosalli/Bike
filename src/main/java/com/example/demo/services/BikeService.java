package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Bike;
import com.example.demo.repository.BikeRepository;

public interface BikeService  {
	
	String createBike(Bike b);
	
	Bike getBike(String id);
	
	List<Bike> getAllBike();
	
	String updateBike(Bike b);
	
	String deleteBike(String id);
	
	
	
	

}
