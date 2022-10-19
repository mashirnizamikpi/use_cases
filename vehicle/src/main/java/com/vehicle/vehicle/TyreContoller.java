package com.vehicle.vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TyreContoller {

	@Autowired
	private TruckRepo tr;
	
	@Autowired
	private BikeRepo br;
	
	@Autowired
	private CarRepo cr;

    @GetMapping("/ct")
 public List<TruckEntity> getSample(){
    	
    	
    	return tr.getjoinblue();
    }
    
    @GetMapping("/tc")
 public List<CarEntity> getSample1(){
    	
    	
    	return cr.getjoinred();
    }
    
    @GetMapping("/bike")
 public List<BikeEntity> getSample2(){
    	
    	
    	return br.getjoinbike();
    }
    
    @GetMapping("/bike2")
 public List<BikeEntity> getSample3(){
    	
    	
    	return br.getjoinbikeq();
    }
    

    }
    	
	
