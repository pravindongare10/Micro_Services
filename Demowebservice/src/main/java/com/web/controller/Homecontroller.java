package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Directive;
import com.web.service.Homeservice;

@RestController
public class Homecontroller {
	@Autowired
	Homeservice hs;
	
	@PostMapping("/saveData")
	public ResponseEntity<String> saveData(@RequestBody Directive s){
			hs.saveDirectiveData(s);
		return new ResponseEntity<String>("saved",HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Directive>>getAlldata(){
		List<Directive> list=hs.getAllData();
		
		return new ResponseEntity<List<Directive>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/getSingleData/{id}/{name}")
	public ResponseEntity<Directive>getSingledata(@PathVariable int id,@PathVariable String name){
		Directive dd=hs.getSingleData(id, name);
		if(dd !=null) {
			return new ResponseEntity<Directive>(dd,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Directive>(HttpStatus.BAD_REQUEST);
		}
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updatealldata(@PathVariable int id,@RequestBody Directive e) {
		hs.saveDirectiveData(e);
		return new ResponseEntity<String>("UpdateData",HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deletedata(@PathVariable("id")int id) {
		hs.deleteData(id);
		return new ResponseEntity<String>("DeleteData",HttpStatus.OK);
	}
	
}  
