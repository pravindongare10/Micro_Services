package com.web.service;

import java.util.List;

import com.web.model.Student;

public interface Homeservice {

	void saveStudentData(Student s);

	public List<Student> GetAllData();

}
