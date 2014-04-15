package com.corespring.methodinjection;

public class Magician implements Performer {
	MagicBox magicBox;
	String magicWords;

	public void perform() {
		System.out.println(magicWords);
		System.out.println("Magic box contains .....");
		System.out.println(magicBox.getContents());

	}

	public MagicBox getMagicBox() {
		return magicBox;
	}

	public void setMagicBox(MagicBox magicBox) {
		this.magicBox = magicBox;
	}

	public String getMagicWords() {
		return magicWords;
	}

	public void setMagicWords(String magicWords) {
		this.magicWords = magicWords;
	}

}
