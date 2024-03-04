package com.web.serviceipml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Student;
import com.web.repository.Homerepo;
import com.web.service.Homeservice;

@Service
public class HomeserviceImpl implements Homeservice{
    @Autowired
    Homerepo hs;
	@Override
	public void saveStudentData(Student s) {
		
		hs.save(s);
	}
	@Override
	public List<Student> GetAllData() {
		List<Student>list=(List<Student>) hs.findAll();
		return null;
	}

}
