package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Student;
import com.web.service.Homeservice;


@RestController
public class HomeController {
	
	@Autowired
	Homeservice hs;
	@PostMapping("/saveData")
	public ResponseEntity<String> saveData(@RequestBody Student s){
			hs.saveStudentData(s);
		return new ResponseEntity<String>("saved",HttpStatus.CREATED);
	}
	
	@GetMapping("/GetAllData")
	public ResponseEntity <List<Student>>GetAllData(){
			List<Student> list=hs.GetAllData();
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
	
}
