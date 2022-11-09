package com.question2.question3_mashir;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

	@Service
	public class EmployeeService {

	    @Autowired
	    private EmployeeRepo em;

	    
		public ArrayList<EmployeeEntity> getemname() {
			ArrayList<EmployeeEntity> emp = new ArrayList<EmployeeEntity>();
			for (EmployeeEntity emt : em.findAll()) {

				EmployeeEntity temp = new EmployeeEntity();

				if (emt.getEmp_name().startsWith("A")) {
					temp.setEmpid(emt.getEmpid());

					temp.setEmp_name(emt.getEmp_name());
					temp.setSalary(emt.getSalary());

					emp.add(temp);

				}

			}
			return emp;

		}
	}