package com.training;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DatePrefixGenerator implements PrefixGenerator {
	
	private DateFormat formatter;
	public DatePrefixGenerator() {
		this.formatter= new SimpleDateFormat("yyyyMMdd");
	}
	
	//@Autowired(required=false)
	private String pattern;

	public void setPattern(String pattern) {
		this.pattern = pattern;
		if(pattern==null)
			this.pattern="yyyyMMdd";
		this.formatter= new SimpleDateFormat(pattern);
	}

	public String getPrefix() {		
		return formatter.format(new Date());
	}

}
