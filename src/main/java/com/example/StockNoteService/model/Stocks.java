package com.example.StockNoteService.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Stocks {
	
	@Id
	private String id;
	private String rate;
	private String open;
	private String high;
	private String low;
	
	private List<String> oldRates;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public List<String> getOldRates() {
		return oldRates;
	}
	public void setOldRates(List<String> oldRates) {
		this.oldRates = oldRates;
	}
	
	
	
	
}

