package com.corespring.getterinjection;

import com.corespring.methodinjection.Performer;

public abstract  class Instrumentalist implements Performer {
	private String song;

	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public void perform() {
		System.out.println("Singing ..."+song);
		getInstrument().playMusic();

	}
public abstract Instrument getInstrument();
}
