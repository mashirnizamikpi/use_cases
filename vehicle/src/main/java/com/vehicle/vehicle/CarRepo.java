package com.vehicle.vehicle;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface CarRepo extends JpaRepository<CarEntity,Integer>
{
	

	
	@Query(value = "Select * From truck t JOIN car c ON t.no_ofTyres=c.no_ofTyres group by c.carid ",nativeQuery=true)
public List<CarEntity> getjoinred();	
	


}
