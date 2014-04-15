package com.training;

public class SequenceGenerator {
	private String prefix;
	private String suffix;
	private int initial;
	private int counter;
	public SequenceGenerator() {
		
	}
	public SequenceGenerator(int initial, String prefix, String suffix) {
		this.initial = initial;
		this.prefix = prefix;
		this.suffix = suffix;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public int getInitial() {
		return initial;
	}
	public void setInitial(int initial) {
		this.initial = initial;
	}
	
	public synchronized String getSequence(){
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefix);
		buffer.append(initial + counter++);
		buffer.append(suffix);
		return buffer.toString();
		
	}

}
