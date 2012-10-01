package com.syntacticsugar.linc.character;

public class Spell {

	private String name = "";
	private int level = 0;
	private String damage = "";
	private String type = "";
	private String domain = "";
	private String notes = "";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public String getDamage() {
		return damage;
	}
	
	public void setDamage(String damage) {
		this.damage = damage;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDomain() {
		return domain;
	}
	
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
