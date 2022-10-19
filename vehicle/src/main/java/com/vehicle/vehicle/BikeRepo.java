package com.vehicle.vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface BikeRepo extends JpaRepository<BikeEntity,Integer>
{
	
	
	@Query(value = "Select * From bike b JOIN car c ON b.no_ofTyres=c.no_ofTyres ",nativeQuery=true)
public List<BikeEntity> getjoinbike();	
	@Query(value = "Select * From car c JOIN bike b ON b.no_ofTyres=c.no_ofTyres ",nativeQuery=true)
public List<BikeEntity> getjoinbikeq();	
	

}
