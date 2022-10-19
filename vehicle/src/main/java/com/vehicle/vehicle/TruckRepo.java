package com.vehicle.vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface TruckRepo extends JpaRepository<TruckEntity,Integer>
{
	
	
	@Query(value = "select * from car,truck where car.No_ofTyres=truck.No_ofTyres",nativeQuery=true)
public List<TruckEntity> getjoin();	
	
	@Query(value = "Select car.car_name From car c JOIN truck t ON t.no_ofTyres=c.no_ofTyres group by t.truckid",nativeQuery=true)
public List<TruckEntity> getjoinblue();

}
