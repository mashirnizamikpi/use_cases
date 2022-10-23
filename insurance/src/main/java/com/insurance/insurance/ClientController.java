package com.insurance.insurance;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@Autowired
	private Client1Repo cl;

	@GetMapping("/detail")
	public List<Client1Entity> getSample() {

		return cl.getjoin();
	}

	@GetMapping("/detail/{policy}")
	public List<Client1Entity> discount(@PathVariable int policy) {

		
		if (policy==10263) {
			
			return cl.getjoin1();
			}
		
		else if (policy==10265) {
			
			return cl.getjoin2();
			}
		
		else if (policy==10267) {
			
			return cl.getjoin3();
			}
		else if (policy==50230) {
			
			return cl.getjoin4();
			}
		else if (policy==50236) {
			
			return cl.getjoin5();
			}
		return null;


}


	@GetMapping("/equaltofive")
	public List<Client1Entity> getSample6() {

		return cl.getjoin6();
	}

	@GetMapping("/morethanfive")
	public List<Client1Entity> getSample7() {

		return cl.getjoin7();
	}

	@GetMapping("/lessthanfive")
	public List<Client1Entity> getSample8() {

		return cl.getjoin8();
	}

	@GetMapping("/{term_plan}/{discount}")

	public int discount(@PathVariable String term_plan, @PathVariable int discount) {

		
		final String more = "morethanfive";
		final String less = "lessthanfive";
		final String equal = "equaltofive";

		int per = 0;

		if (term_plan.equals(less)) {
			
			per = 0;

		}

		else if (term_plan.equals(equal)) {

			per = 10 * discount / 100;

		} else if (term_plan.equals(more)) {

			per = 12 * discount / 100;

		}
		return discount - per;

	}
}
