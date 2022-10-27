package com.kpi.microservices.currencyexchangexample.demo;  

public class CurrencyConversionBean {
	  private Long id;
	  private String from;
	  private String to;
	  private double conversionMultiple;
	  private int quantity;
	  private double totalCalculatedAmount;
	  private int port;

	  public CurrencyConversionBean() {

	  }
	  
	  

	  public CurrencyConversionBean(Long id, String from, String to, double conversionMultiple, int quantity,
	      double totalCalculatedAmount, int port) {
	    super();
	    this.id = id;
	    this.from = from;
	    this.to = to;
	    this.conversionMultiple = conversionMultiple;
	    this.quantity = quantity;
	    this.totalCalculatedAmount = totalCalculatedAmount;
	    this.port = port;
	  }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public double  getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(int conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(int totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}