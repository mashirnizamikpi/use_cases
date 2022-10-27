package com.kpi.microservice.currencyexchangeexampleservice.demo2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepo extends JpaRepository<ExchangeValueEntity,Integer>{
ExchangeValueEntity findByFromAndTo(String from,String to);
}
