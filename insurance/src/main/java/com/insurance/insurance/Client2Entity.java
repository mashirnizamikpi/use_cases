package com.insurance.insurance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="client2")


public class Client2Entity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Integer insurance_id;
	private String Client_Name;
	private Integer Term_Plan;
	private String Maturity_Date;
	public Integer getInsurance_id() {
		return insurance_id;
	}
	public void setInsurance_id(Integer insurance_id) {
		this.insurance_id = insurance_id;
	}
	public String getClient_Name() {
		return Client_Name;
	}
	public void setClient_Name(String client_Name) {
		Client_Name = client_Name;
	}
	public Integer getTerm_Plan() {
		return Term_Plan;
	}
	public void setTerm_Plan(Integer term_Plan) {
		Term_Plan = term_Plan;
	}
	public String getMaturity_Date() {
		return Maturity_Date;
	}
	public void setMaturity_Date(String maturity_Date) {
		Maturity_Date = maturity_Date;
	}
	
	

	




}
