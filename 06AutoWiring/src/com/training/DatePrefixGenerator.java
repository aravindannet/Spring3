package com.training;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrefixGenerator implements PrefixGenerator {
	
	private DateFormat formatter;
	
	private String pattern;

	public void setPattern(String pattern) {
		this.pattern = pattern;
		this.formatter= new SimpleDateFormat(pattern);
	}

	public String getPrefix() {		
		return formatter.format(new Date());
	}

}
