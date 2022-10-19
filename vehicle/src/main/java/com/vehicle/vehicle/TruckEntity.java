package com.vehicle.vehicle;



import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="truck")


public class TruckEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Integer truckid;
	private String Truck_Name;
	private Integer No_oftyres;
	public Integer getTruckid() {
		return truckid;
	}
	public void setTruckid(Integer truckid) {
		this.truckid = truckid;
	}
	public String getTruck_Name() {
		return Truck_Name;
	}
	public void setTruck_Name(String truck_Name) {
		Truck_Name = truck_Name;
	}
	public Integer getNo_oftyres() {
		return No_oftyres;
	}
	public void setNo_oftyres(Integer no_oftyres) {
		No_oftyres = no_oftyres;
	}
	

	





}
