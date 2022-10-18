package com.country.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThirdController {
	@Autowired
	private EmployeeRepo er;// up to date

	@GetMapping("/employee") 
	
	public ArrayList<String> getempname(){
		ArrayList<String> ename=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {

    		
    		    		 			 			
        		
        		
		   		
        		ename.add(emt.getEmployee_name());
    		}

    	
    	return ename;
	}

}
