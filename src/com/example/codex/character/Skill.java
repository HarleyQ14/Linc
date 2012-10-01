package com.example.codex.character;

import com.example.codex.character.Ability.Abilities;

public class Skill {

	private String name = "";
	private Abilities keyAbility;
	private int ranks = 0;
	private int misc = 0;
	private boolean classSkill = false;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Abilities getKeyAbility() {
		return keyAbility;
	}
	
	public void setKeyAbility(Abilities keyAbility) {
		this.keyAbility = keyAbility;
	}
	
	public int getRanks() {
		return ranks;
	}
	
	public void setRanks(int ranks) {
		this.ranks = ranks;
	}
	
	public int getMisc() {
		return misc;
	}
	
	public void setMisc(int misc) {
		this.misc = misc;
	}
	
	public boolean isClassSkill() {
		return classSkill;
	}
	
	public void setClassSkill(boolean classSkill) {
		this.classSkill = classSkill;
	}
}
