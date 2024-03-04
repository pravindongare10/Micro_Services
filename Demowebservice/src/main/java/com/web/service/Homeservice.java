package com.web.service;

import java.util.List;

import com.web.model.Directive;

public interface Homeservice {

	public void saveDirectiveData(Directive s);

	public List<Directive> getAllData();

	public Directive getSingleData(int id, String name);

	public void deleteData(int id);

}
