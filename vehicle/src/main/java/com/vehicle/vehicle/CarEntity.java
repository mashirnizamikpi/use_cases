package com.vehicle.vehicle;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="car")


public class CarEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Integer carid;
	private String Car_Name;
	private Integer No_oftyres;
	


	
	public Integer getCarid() {
		return carid;
	}
	public void setCarid(Integer carid) {
		this.carid = carid;
	}
	public String getCar_Name() {
		return Car_Name;
	}
	public void setCar_Name(String car_Name) {
		Car_Name = car_Name;
	}
	public Integer getNo_oftyres() {
		return No_oftyres;
	}
	public void setNo_oftyres(Integer no_oftyres) {
		No_oftyres = no_oftyres;
	}



}
