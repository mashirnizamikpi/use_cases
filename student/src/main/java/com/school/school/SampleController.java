package com.school.school;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {
	@Autowired
	private StudentRepo sr;//up to date


		
	@GetMapping("/dates") 

		public List<StudentEntity> getSample(){
			ArrayList<StudentEntity> transformedvalues=new ArrayList<StudentEntity>();
	    	for(StudentEntity emt:sr.findAll()) {
	    		StudentEntity temp=new StudentEntity();
	    		
	    		if(emt.getDate_of_Join().contains("2000-01-01")) {
	    			temp.setId(emt.getId());
	    			temp.setDate_of_Join(emt.getDate_of_Join());
	    			temp.setStudent_Name(emt.getStudent_Name());
	    		}
	    		transformedvalues.add(temp);
	    	}
	    	return transformedvalues;
		}

}
