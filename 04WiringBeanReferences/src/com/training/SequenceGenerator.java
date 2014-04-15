package com.training;

public class SequenceGenerator {
	private int initial;
	private int counter;
	private String suffix;
	private PrefixGenerator prefixGenerator;
	public SequenceGenerator() {
		// TODO Auto-generated constructor stub
	}
	
	public SequenceGenerator(int initial, PrefixGenerator prefixGenerator,
			String suffix) {
		
		this.initial = initial;
		this.prefixGenerator = prefixGenerator;
		this.suffix = suffix;
	}



	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
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
		buffer.append(suffix);
		return buffer.toString();
		
	}

}
