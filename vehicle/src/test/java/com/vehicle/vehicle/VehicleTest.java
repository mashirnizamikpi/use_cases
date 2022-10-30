package com.vehicle.vehicle;

import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class VehicleTest {
	
	
	    @Autowired
	    private BikeRepo br;
	    
	    @Autowired
	    private CarRepo cr;
	  
	    @Autowired
	    private TruckRepo tr;

	    @Test
	    public void BikeTest() {
	        List<BikeEntity> bike = br.getbike();

	        Assert.assertEquals(bike.get(1).getBike_Name(),"Hyundai");
	    }
	    @Test
	    public void CarTest() {
	        List<CarEntity> car = cr.getcar();

	        Assert.assertEquals(car.get(2).getCar_Name(),"Rolex");
	    }
	}




