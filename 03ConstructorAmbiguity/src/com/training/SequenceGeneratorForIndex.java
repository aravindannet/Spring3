package com.training;

public class SequenceGeneratorForIndex {
	private String prefix;
	private String suffix;
	private int initial;
	private int counter;
	public SequenceGeneratorForIndex() {		
	}

	public SequenceGeneratorForIndex(String prefix, String suffix) {
		this.prefix = prefix;
		this.suffix = suffix;
	}
	

	
	public SequenceGeneratorForIndex(int initial, String suffix) {
		super();
		this.initial = initial;
		this.suffix = suffix;
	}
	public SequenceGeneratorForIndex( String prefix,int initial) {
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
