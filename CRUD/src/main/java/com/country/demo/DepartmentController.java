package com.country.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	@Autowired
	private EmployeeRepo er;// up to date

	@GetMapping("/department") 
	
	public ArrayList<String> getempdepartment(){
		ArrayList<String> edep=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {

    		
    		    		 			 			
    		
        		
        		
		   		
        		edep.add(emt.getDepartment());
    		}

    	
    	return edep;
	}

}
