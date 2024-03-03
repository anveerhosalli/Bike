package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bike;
import com.example.demo.services.BikeServiceImplimentation;

@RestController
@RequestMapping(value="/bike")
public class BikeController {

	BikeServiceImplimentation bsi;



	public BikeController(BikeServiceImplimentation bsi) {
		super();
		this.bsi = bsi;
	}


	@PostMapping
	public String create(@RequestBody Bike b) {
		return	bsi.createBike(b);

	}
	
	@GetMapping(value="{id}")
	public Bike read(@PathVariable(value="id") String id) {
		return bsi.getBike(id);
	}
	
	@GetMapping
	public List<Bike> getAllBike(){
		return bsi.getAllBike();
	}
	
	@PutMapping(value="{id}")
	public String update(@RequestBody Bike b) {
		return bsi.updateBike(b);
	}
	
	@DeleteMapping(value="{id}")
	public String delete(@PathVariable(value="id") String id) {
		return bsi.deleteBike(id);
	}
	
	


}
