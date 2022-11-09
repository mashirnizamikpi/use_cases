package com.question2.question3_mashir;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * 
 * @author MashirNizami
 *
 */
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepo er;

	@GetMapping("/A")

	public ArrayList<EmployeeEntity> getemname() {
		ArrayList<EmployeeEntity> emp = new ArrayList<EmployeeEntity>();
		for (EmployeeEntity emt : er.findAll()) {

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