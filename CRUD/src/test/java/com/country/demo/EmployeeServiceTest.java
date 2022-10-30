package com.country.demo;

import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class EmployeeServiceTest {
	
	
	    @Autowired
	    private EmployeeService emp;

	    @Test
	    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
	        List<EmployeeEntity> employee = emp.getSample();

	        Assert.assertEquals(employee.get(6).getEmployee_name(), "abhay");
	        Assert.assertEquals(employee.get(5).getEmployee_name(), "Piyush");
	     Assert.assertEquals(employee.get(9).getDepartment(), employee.get(8).getDepartment());
	     Assert.assertEquals(employee.get(9).getDepartment(), employee.get(8).getDepartment(),"marketing");
	    }
	}




