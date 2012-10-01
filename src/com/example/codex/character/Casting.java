package com.example.codex.character;

public class Casting {
	
	private int level = 0;
	private int perDay = 0;
	private String bonus = "";
	private int save = 0;
	private int failure = 0;
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getPerDay() {
		return perDay;
	}
	
	public void setPerDay(int perDay) {
		this.perDay = perDay;
	}
	
	public String getBonus() {
		return bonus;
	}
	
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	
	public int getSave() {
		return save;
	}
	
	public void setSave(int save) {
		this.save = save;
	}
	
	public int getFailure() {
		return failure;
	}
	
	public void setFailure(int failure) {
		this.failure = failure;
	}
}
