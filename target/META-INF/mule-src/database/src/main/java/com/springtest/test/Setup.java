package com.springtest.test;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Setup {
	@Autowired
	EmployeeRepository em;
	@PostConstruct
	public void initializeDB() {
		Employee e1 = new Employee();
		e1.setEmployeeId(1);
		e1.setEmployeeName("Even");
		e1.setCity("Pune");
		
		Employee e2 = new Employee();
		e2.setEmployeeId(2);
		e2.setEmployeeName("Odd");
		e2.setCity("Pune");
		
		
		em.save(e1);
		em.save(e2);
		
		
	}

}
