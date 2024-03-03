package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Bike;
import com.example.demo.repository.BikeRepository;

@Service
public class BikeServiceImplimentation implements BikeService {
	
	BikeRepository brepo;
	

	public BikeServiceImplimentation(BikeRepository brepo) {
		super();
		this.brepo = brepo;
	}

	@Override
	public String createBike(Bike b) {
		brepo.save(b);
		return "Bike Created";
	}

	@Override
	public Bike getBike(String id) {
		
		return brepo.findById(id).get();
	}

	@Override
	public List<Bike> getAllBike() {
		
		return brepo.findAll();
	}

	@Override
	public String updateBike(Bike b) {
		brepo.save(b);
		return "Bike updated";
	}

	@Override
	public String deleteBike(String id) {
		brepo.deleteById(id);
		return "bike deleted";
	}

}
