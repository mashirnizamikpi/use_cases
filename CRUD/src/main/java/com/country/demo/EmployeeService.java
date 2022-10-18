package com.country.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


	@Service
	public class EmployeeService {

	    @Autowired
	    private EmployeeRepo em;

	   	
		public List<EmployeeEntity> getSample(){
			ArrayList<EmployeeEntity> transformedvalues=new ArrayList<EmployeeEntity>();
	    	for(EmployeeEntity emt:em.findAll()) {
	    		EmployeeEntity temp=new EmployeeEntity();
	    		temp.setId(emt.getId());
	    		temp.setEmployee_name(emt.getEmployee_name());
	    		transformedvalues.add(temp);
	    		}
	    	return transformedvalues;	
	    	}
	    	
	    
	    }
	    
	