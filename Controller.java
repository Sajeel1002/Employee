package com.cg.aem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController

@CrossOrigin(allowedHeaders="*", origins="*")
public class Controller {
	@Autowired
	private EmployeeService service;
	@PostMapping("/registeremployees")
	public employee registeremployees(@RequestBody employee Employee){ return service.registeremployees(Employee); }
	
	//Retrieval
		@GetMapping("/getemployee")
		public List<employee>getemployee(){
			return  service.getemployee();
		}
		
		@DeleteMapping("/deleteemployee")
		public void deleteemployee (@RequestParam Integer id){ service.deleteemployee(id);}
	
		@PutMapping("/updateemployee")
		public employee updateemployee (@RequestBody employee employee) {
		return service.updateemployee(employee);}
}
		