package com.syntacticsugar.linc.character;

public class SavingThrow {
	
	public enum SavingThrows {
		Fortitude,
		Reflex,
		Will
	};
	
	private SavingThrows savingThrow;
	private String type = "";
	private int value = 0;
	
	public SavingThrows getSavingThrow() {
		return savingThrow;
	}
	
	public void setSavingThrow(SavingThrows savingThrow) {
		this.savingThrow = savingThrow;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
