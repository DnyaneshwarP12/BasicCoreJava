package com.tns.dayfive.multilevelinheritance;

public class State extends Country {
	
	private String statename;
	private String language;
	
	public String getstatename() {
		return statename;
	}
	
	public void setstatename(String statename) {
		this.statename=statename;
		
	}
	
	public String getlanguage() {
		return language;
	}
	
	public void setlanguage(String language) {
		this.language=language;
	}

	@Override
	public String toString() {
		return "State [statename=" + statename + ", language=" + language + ", getcountryname()=" + getcountryname()
				+ ", getcapital()=" + getcapital() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
