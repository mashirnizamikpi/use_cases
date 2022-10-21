package com.insurance.insurance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Client1Repo extends JpaRepository<Client1Entity, Integer> {

	@Query(value = "Select * From client1", nativeQuery = true)
	public List<Client1Entity> getjoin();

	@Query(value = "Select * From client1 where insurance_id =10263", nativeQuery = true)
	public List<Client1Entity> getjoin1();

	@Query(value = "Select * From client1 where insurance_id =10265", nativeQuery = true)
	public List<Client1Entity> getjoin2();

	@Query(value = "Select * From client1 where insurance_id =10267", nativeQuery = true)
	public List<Client1Entity> getjoin3();

	@Query(value = "Select * From client1 where insurance_id =50230", nativeQuery = true)
	public List<Client1Entity> getjoin4();

	@Query(value = "Select * From client1 where insurance_id =50236", nativeQuery = true)
	public List<Client1Entity> getjoin5();

	@Query(value = "Select * From client1 where term_plan=5", nativeQuery = true)
	public List<Client1Entity> getjoin6();

	@Query(value = "Select * From client1 where term_plan>5", nativeQuery = true)
	public List<Client1Entity> getjoin7();

	@Query(value = "Select * From client1 where term_plan<5", nativeQuery = true)
	public List<Client1Entity> getjoin8();

}
