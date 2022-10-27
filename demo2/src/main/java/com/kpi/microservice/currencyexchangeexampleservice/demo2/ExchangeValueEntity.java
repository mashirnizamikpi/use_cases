package com.kpi.microservice.currencyexchangeexampleservice.demo2;

import java.math.BigDecimal;  
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;
import javax.persistence.Table;  
@Entity  
@Table(name ="exchange_value")  
public class ExchangeValueEntity {
	@Id  
	@Column(name="id")  
	private Long id;  
	@Column(name="currency_from")  
	private String from;  
	@Column(name="currency_to")  
	private String to;  
	@Column(name="conversion_multiple")  
	private BigDecimal conversionMultiple;  
	@Column(name="port")  
	private int port;  
	 
	public ExchangeValueEntity()  
	{     
	}  
	//generating constructor using fields  
	public ExchangeValueEntity(Long id, String from, String to, BigDecimal conversionMultiple)   
	{  
	super();  
	this.id = id;  
	this.from = from;  
	this.to = to;  
	this.conversionMultiple = conversionMultiple;  
	}  
	//generating getters and setters  
	public int getPort()   
	{  
	return port;  
	}  
	public void setPort(int port)   
	{  
	this.port = port;  
	}  
	public Long getId()   
	{  
	return id;  
	}  
	public String getFrom()   
	{  
	return from;  
	}  
	public String getTo()   
	{  
	return to;  
	}  
	public BigDecimal getConversionMultiple()   
	{  
	return conversionMultiple;  
	}  

}
