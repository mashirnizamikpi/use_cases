package com.insurance.insurance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@Autowired
	private Client1Repo cl;
	




    @GetMapping("/detail")
 public List<Client1Entity> getSample(){
    	
    	
    	 	
    	return cl.getjoin();
    }
    
    @GetMapping("/detail/10263")
 public List<Client1Entity> getSample1(){
    	
    	
    	return cl.getjoin1();
    }
    @GetMapping("/detail/10265")
 public List<Client1Entity> getSample2(){
    	
    	
    	return cl.getjoin2();
    }
    
    @GetMapping("/detail/10267")
 public List<Client1Entity> getSample3(){
    	
    	
    	return cl.getjoin3();
    }
    
    @GetMapping("/detail/50230")
 public List<Client1Entity> getSample4(){
    	
    	
    	return cl.getjoin4();
    }
    @GetMapping("/detail/50236")
 public List<Client1Entity> getSample5(){
    	
    	
    	return cl.getjoin5();
    }
    
    
    

    }
    	
	
