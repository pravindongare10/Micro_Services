package com.web.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Directive;
import com.web.repository.Homerepo;
import com.web.service.Homeservice;

@Service
public class serviceimpl implements Homeservice{
	@Autowired
	Homerepo hr;
	@Override
	public void saveDirectiveData(Directive s) {
		hr.save(s);
	}
	@Override
	public List<Directive> getAllData() {
		List<Directive> ls=(List<Directive>) hr.findAll();
		return ls;
	}
	
	@Override
	public Directive getSingleData(int id, String name) {
	
		return hr.findAllByIdAndName(id, name);
	}
	@Override
	public void deleteData(int id) {
		hr.deleteById(id);
		
	}

}
