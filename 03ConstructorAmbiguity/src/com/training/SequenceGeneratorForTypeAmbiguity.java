package com.training;

public class SequenceGeneratorForTypeAmbiguity {
	private String prefix;
	private String suffix;
	private int initial;
	private int counter;
	public SequenceGeneratorForTypeAmbiguity() {		
	}

	public SequenceGeneratorForTypeAmbiguity(String prefix, String suffix) {
		this.prefix = prefix;
		this.suffix = suffix;
	}
	
	public SequenceGeneratorForTypeAmbiguity( String prefix,int initial) {
		this.initial = initial;
		this.prefix = prefix;
	}


	
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	
	public synchronized String getSequence(){
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefix);
		buffer.append(initial + counter++);
		buffer.append(suffix);
		return buffer.toString();
		
	}


}
