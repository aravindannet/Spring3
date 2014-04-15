package com.training;

import java.util.List;
import java.util.Map;

public class SequenceGeneratorWithMap {
	private int initial;
	private int counter;
	private Map<Object, Object> suffixes;
	private PrefixGenerator prefixGenerator;
	public SequenceGeneratorWithMap() {
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
		for(Map.Entry entry:suffixes.entrySet()){
			buffer.append("-");
			buffer.append(entry.getKey());	
			buffer.append("@");
			buffer.append(entry.getValue());
		}
		
		return buffer.toString();
		
	}



	public Map<Object, Object> getSuffixes() {
		return suffixes;
	}



	public void setSuffixes(Map<Object, Object> suffixes) {
		this.suffixes = suffixes;
	}



}
