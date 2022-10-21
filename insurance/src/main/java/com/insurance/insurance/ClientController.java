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

	@GetMapping("/detail/10263")
	public List<Client1Entity> getSample1() {

		return cl.getjoin1();
	}

	@GetMapping("/detail/10265")
	public List<Client1Entity> getSample2() {

		return cl.getjoin2();
	}

	@GetMapping("/detail/10267")
	public List<Client1Entity> getSample3() {

		return cl.getjoin3();
	}

	@GetMapping("/detail/50230")
	public List<Client1Entity> getSample4() {

		return cl.getjoin4();
	}

	@GetMapping("/detail/50236")
	public List<Client1Entity> getSample5() {

		return cl.getjoin5();
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

		}

		else if (term_plan.equals(equal)) {

			per = 10 * discount / 100;

		} else if (term_plan.equals(more)) {

			per = 12 * discount / 100;

		}
		return discount - per;

	}
}
