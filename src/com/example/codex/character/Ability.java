package com.example.codex.character;

public class Ability {

	public enum Abilities {
		Strength,
		Dexterity,
		Constitution,
		Intelligence,
		Wisdom,
		Charisma
	};
	
	private Abilities ability;
	private String type = "";
	private int value = 0;
	
	public Abilities getAbility() {
		return ability;
	}
	
	public void setAbility(Abilities ability) {
		this.ability = ability;
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
