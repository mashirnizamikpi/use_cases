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

	        Assert.assertEquals(employee.size(), 10);
	    }
	}


