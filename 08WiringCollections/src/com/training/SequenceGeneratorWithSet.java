package com.training;

import java.util.List;
import java.util.Set;

public class SequenceGeneratorWithSet {
	private int initial;
	private int counter;
	private Set<Object> suffixes;
	private PrefixGenerator prefixGenerator;
	public SequenceGeneratorWithSet() {
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
	
	public Set<Object> getSuffixes() {
		return suffixes;
	}



	public void setSuffixes(Set<Object> suffixes) {
		this.suffixes = suffixes;
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



}
