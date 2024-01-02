package com.jaxb7.enterprise.web.starter;
 
import java.util.Calendar;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class StarterController {
	
	@GetMapping("/v1/hello")
	public String getEmployeeByID() {
		System.out.println("hello " + Calendar.getInstance().toString());
		return "hello";
	}
	
	@PostMapping("/v1/register")
	public ResponseEntity <Employee> employeeByID(@RequestBody Employee emp) {
		System.out.println("hello " + Calendar.getInstance().toString());
		
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}

}
