package com.kpi.microservice.currencyexchangeexampleservice.demo2;

import java.math.BigDecimal;

public class CurrencyConversionSampleBean {
	private long id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal ConversionMultiple;
	private BigDecimal totalCalculatedAmount;
	private int port;
	
	public CurrencyConversionSampleBean () {
		
	}
	
	public CurrencyConversionSampleBean (Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity, BigDecimal totalCalculatedAmount, int port) {
		super();  
		this.id = id;  
		this.from = from;  
		this.to = to;  
		ConversionMultiple = conversionMultiple;  
		this.quantity = quantity;  
		this.totalCalculatedAmount = totalCalculatedAmount;  
		this.port = port;  
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getConversionMultiple() {
		return ConversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		ConversionMultiple = conversionMultiple;
	}
	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
	
	 
	}  


