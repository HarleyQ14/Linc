package com.syntacticsugar.linc.character;

public class Weapon {

	private String name = "";
	private int attackBonus = 0;
	private String damage = "";
	private String crit = "";
	private int range = 0;
	private String type = "";
	private String notes = "";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAttackBonus() {
		return attackBonus;
	}
	
	public void setAttackBonus(int attackBonus) {
		this.attackBonus = attackBonus;
	}
	
	public String getDamage() {
		return damage;
	}
	
	public void setDamage(String damage) {
		this.damage = damage;
	}
	
	public String getCrit() {
		return crit;
	}
	
	public void setCrit(String crit) {
		this.crit = crit;
	}
	
	public int getRange() {
		return range;
	}
	
	public void setRange(int range) {
		this.range = range;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
