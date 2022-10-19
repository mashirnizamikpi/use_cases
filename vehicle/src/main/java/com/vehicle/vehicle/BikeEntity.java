package com.vehicle.vehicle;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="bike")


public class BikeEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Integer bikeid;
	private String Bike_Name;
	private Integer No_oftyres;
	
	

	public Integer getBikeid() {
		return bikeid;
	}
	public void setBikeid(Integer bikeid) {
		this.bikeid = bikeid;
	}
	public String getBike_Name() {
		return Bike_Name;
	}
	public void setBike_Name(String bike_Name) {
		Bike_Name = bike_Name;
	}
	public Integer getNo_oftyres() {
		return No_oftyres;
	}
	public void setNo_oftyres(Integer no_oftyres) {
		No_oftyres = no_oftyres;
	}
	




}
