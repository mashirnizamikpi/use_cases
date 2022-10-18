package com.country.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FourthController {
	@Autowired
	private EmployeeRepo er;// up to date

	@GetMapping("/A") 
	
	public ArrayList<EmployeeEntity> getemname(){
		ArrayList<EmployeeEntity> emp=new ArrayList<EmployeeEntity>();
    	for(EmployeeEntity emt:er.findAll()) {
    	
    		EmployeeEntity temp=new EmployeeEntity();
    		
    		if(emt.getEmployee_name().startsWith("a")) {
    		 temp.setId(emt.getId());
    		
			temp.setEmployee_name(emt.getEmployee_name());
		
		emp.add(temp);

    		}
    		    		 			 			
    		
		
    		

    	
	}
		return emp;

}
}
