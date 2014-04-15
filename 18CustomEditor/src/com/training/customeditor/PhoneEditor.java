package com.training.customeditor;

import java.beans.PropertyEditorSupport;

public class PhoneEditor extends PropertyEditorSupport{
	
	 public void setAsText(String text) {
		 int countryCode=Integer.parseInt(text.substring(0,2));
		 int areaCode=Integer.parseInt(text.substring(3,5)); 
		 int number=Integer.parseInt(text.substring(5));
		 PhoneNumber phone=new PhoneNumber(countryCode,areaCode,number);
		 setValue(phone);
	 }

}
