package com.cg.aem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class EmployeeService {
@Autowired
private Repository repository;

public employee registeremployees(employee Employee) {
	// TODO Auto-generated method stub
	return repository.save(Employee);
}


public List<employee> getemployee() {
	// TODO Auto-generated method stub
	return repository.findAll();
}

public void deleteemployee(Integer id) {
	// TODO Auto-generated method stub
	repository.deleteById(id);
}


public employee updateemployee(employee employee) {
	 Integer id = employee.getId();
	 employee emp= repository.findById(id).get();

	

	emp.setName(employee.getName());
	emp.setAddress(employee.getAddress());
	emp.setDesignation(employee.getDesignation());
	emp.setSalary (employee.getSalary());
	emp.setDob(employee.getDob());
	return repository.save(emp); 
	}


}



