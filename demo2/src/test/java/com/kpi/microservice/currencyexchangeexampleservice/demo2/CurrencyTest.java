package com.kpi.microservice.currencyexchangeexampleservice.demo2;

import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CurrencyTest {
	
	
	    @Autowired
	    private ExchangeValueRepo exp;

	    @Test
	    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
	        List<ExchangeValueEntity> exchange = exp.findAll();

	        Assert.assertEquals(exchange.get(1).getPort(),8080);
	        Assert.assertEquals(exchange.get(0).getConversionMultiple().intValue(),65);
	    }
	}




