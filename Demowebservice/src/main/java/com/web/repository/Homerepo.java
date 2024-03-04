package com.web.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Directive;

@Repository
public interface Homerepo extends CrudRepository<Directive, Integer> {
	public Directive findAllByIdAndName(int id, String name);
}
