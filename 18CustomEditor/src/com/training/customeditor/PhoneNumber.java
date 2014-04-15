package com.training.customeditor;

public class PhoneNumber {
	private int countryCode; 
	private int areaCode;
	private int number;
	public PhoneNumber() {
		
	}
	public PhoneNumber(int countryCode, int areaCode, int number) {
		super();
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.number = number;
	}
	public int getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

}
