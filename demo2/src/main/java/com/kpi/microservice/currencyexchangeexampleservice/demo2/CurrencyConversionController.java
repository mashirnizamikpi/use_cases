package com.kpi.microservice.currencyexchangeexampleservice.demo2;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {
	 

	  @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	  public CurrencyConversionSampleBean convertCurrency(@PathVariable String from, @PathVariable String to,
	      @PathVariable BigDecimal quantity) {

	    Map<String, String> uriVariables = new HashMap<>();
	    uriVariables.put("from", from);
	    uriVariables.put("to", to);
	    ResponseEntity<CurrencyConversionSampleBean> responseEntity = new RestTemplate().getForEntity(
	            "http://localhost:8080/currency-exchange/from/{from}/to/{to}", CurrencyConversionSampleBean.class,
	            uriVariables);

	        CurrencyConversionSampleBean response = responseEntity.getBody();

	        return new CurrencyConversionSampleBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
	            quantity.multiply(response.getConversionMultiple()), response.getPort());
}}
