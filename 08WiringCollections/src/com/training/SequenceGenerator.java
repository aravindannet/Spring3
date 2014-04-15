package com.training;

import java.util.List;

public class SequenceGenerator {
	private int initial;
	private int counter;
	private List<Object> suffixes;
	private PrefixGenerator prefixGenerator;
	public SequenceGenerator() {
		// TODO Auto-generated constructor stub
	}
	


	public PrefixGenerator getPrefixGenerator() {
		return prefixGenerator;
	}
	public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
		this.prefixGenerator = prefixGenerator;
	}
	public int getInitial() {
		return initial;
	}
	public void setInitial(int initial) {
		this.initial = initial;
	}
	
	public synchronized String getSequence(){
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefixGenerator.getPrefix());
		buffer.append(initial + counter++);
		for(Object  suffix:suffixes){
			buffer.append("-");
			buffer.append(suffix);	
		}
		
		return buffer.toString();
		
	}



	public List<Object> getSuffixes() {
		return suffixes;
	}



	public void setSuffixes(List<Object> suffixes) {
		this.suffixes = suffixes;
	}

}
