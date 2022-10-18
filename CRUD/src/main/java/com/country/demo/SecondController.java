package com.country.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
	@Autowired
	private EmployeeRepo er;// up to date

	@GetMapping("/id") 
	
	public ArrayList<Integer> getempid(){
		ArrayList<Integer> eid=new ArrayList<Integer>();
    	for(EmployeeEntity emt:er.findAll()) {

    			
    		eid.add(emt.getId());
    		}

    	
    	return eid;
	}

}
