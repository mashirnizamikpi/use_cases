package com.school.school;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")


public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
	private String Date_of_Join;
	private String Student_Name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDate_of_Join() {
		return Date_of_Join;
	}
	public void setDate_of_Join(String date_of_Join) {
		Date_of_Join = date_of_Join;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}

	


}
