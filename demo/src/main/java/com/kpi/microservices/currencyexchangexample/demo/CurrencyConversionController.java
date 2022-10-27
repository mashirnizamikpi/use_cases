package com.kpi.microservices.currencyexchangexample.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable int quantity) {
		final String ind = "INR";
		final String more = "PAK";
		final String less = "BAN";
		final String equal = "USD";
		final String rus = "RUBLE";
		final String jap = "YEN";

		double per = 0;
		double mul = 0;
		Long id = (long) 0;
		// comparison with India
		if (from.equals(ind)) {
			if (to.equals(less)) {
				mul = 1.7;
				per = quantity * mul;
				id = (long) 1;
			}

			else if (to.equals(jap)) {
				mul = 1.5;
				per = quantity * mul;
				id = (long) 2;

			} else if (to.equals(more)) {
				mul = 2.77;
				per = quantity * mul;
				id = (long) 3;
			}
		}

		else if (from.equals(more)) {
			if (to.equals(ind)) {
				mul = 0.37;
				per = quantity * mul;
				id = (long) 4;

			}
		}

//Comparison with USA
		else if (from.equals(equal)) {
			if (to.equals(ind)) {
				mul = 50;
				per = quantity * mul;
				id = (long) 5;
			} else if (to.equals(more)) {
				mul = 60;
				per = quantity * mul;
				id = (long) 6;
			}
		}

		else if (from.equals(rus)) {
			if (to.equals(ind)) {
				mul = 1.33;
				per = quantity * mul;
				id = (long) 7;
			}
		}

		return new CurrencyConversionBean(id, from, to, mul, quantity, per, 8100);

	}
}