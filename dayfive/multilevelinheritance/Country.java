package com.tns.dayfive.multilevelinheritance;

public class Country {
	
	private String countryname;
	private String capital;
	
	public String getcountryname() {
		return countryname;
	}
	
	public void setcountryname(String countryname) {
		this.countryname=countryname;
	}
	
	public String getcapital() {
		return capital;
	}
	
	public void setcapital(String capital) {
		this.capital=capital;
	}

	@Override
	public String toString() {
		return "Country [countryname=" + countryname + ", capital=" + capital + "]";
	}
	
	
}
