package com.syntacticsugar.linc.character;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Represents a dnd 3.5 character containing all of the
 * necessary information and stats.
 * 
 * @author HarleyQ14
 * @date 2012-09-29
 */
public class Character {

	public enum Size {
		Tiny,
		Small,
		Medium,
		Large,
		Huge,
		Gargantuan,
		Fine,
		Diminutive,
		Colossal
	};
	
	public enum Gender {
		Female,
		Male,
		Inditerminate
	};
	
	public enum Alignment {
		LawfulGood,
		NeutralGood,
		ChaoticGood,
		LawfulNeutral,
		Neutral,
		ChaoticNeutral,
		LawfulEvil,
		NeutralEvil,
		ChaoticEvil
	};
	
	public enum SavingThrows {
		Fortitude,
		Reflex,
		Will
	};
		
	private String name = "";
	private String race = "";
	private String player = "";
	private String template = "";
	private Size size;
	private Gender gender;
	private Alignment alignment;
	private String religion = "";
	private String height = "";
	private String weight = "";
	private String description = "";
	
	private ArrayList<Ability> abilities;
	
	private int hp = 0;
	private int tempHp = 0;
	private int speed = 0;
	private int initiative = 0;

	private HashMap<String, Integer> attackBonus;
	private ArrayList<SavingThrow> savingThrows;
	private ArrayList<Weapon> weapons;
	private String hitDiceRoll = "";
	private ArrayList<HitDice> health;
	private String combatConditions = "";
	private ArrayList<ArmorClass> armorClass;
	private ArrayList<Item> inventory;
	private ArrayList<Skill> skills;
	private ArrayList<Feat> feats;
	
	private ArrayList<Casting> castings;
	private ArrayList<Spell> spells;

	private String domain = "";
	private String greaterPower = "";
	
	private int ragePerDay = 0;
	private String duration = "";
	private int acPenalty = 0;
	private int ragesUsed = 0;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRace() {
		return race;
	}
	
	public void setRace(String race) {
		this.race = race;
	}
	
	public String getPlayer() {
		return player;
	}
	
	public void setPlayer(String player) {
		this.player = player;
	}
	
	public String getTemplate() {
		return template;
	}
	
	public void setTemplate(String template) {
		this.template = template;
	}
	
	public Size getSize() {
		return size;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Alignment getAlignment() {
		return alignment;
	}
	
	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}
	
	public String getReligion() {
		return religion;
	}
	
	public void setReligion(String religion) {
		this.religion = religion;
	}
	
	public String getHeight() {
		return height;
	}
	
	public void setHeight(String height) {
		this.height = height;
	}
	
	public String getWeight() {
		return weight;
	}
	
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ArrayList<Ability> getAbilities() {
		return abilities;
	}
	
	public void setAbilities(ArrayList<Ability> abilities) {
		this.abilities = abilities;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getTempHp() {
		return tempHp;
	}
	
	public void setTempHp(int tempHp) {
		this.tempHp = tempHp;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getInitiative() {
		return initiative;
	}
	
	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}
	
	public HashMap<String, Integer> getAttackBonus() {
		return attackBonus;
	}
	
	public void setAttackBonus(HashMap<String, Integer> attackBonus) {
		this.attackBonus = attackBonus;
	}
	
	public ArrayList<SavingThrow> getSavingThrows() {
		return savingThrows;
	}
	
	public void setSavingThrows(ArrayList<SavingThrow> savingThrows) {
		this.savingThrows = savingThrows;
	}
	
	public ArrayList<Weapon> getWeapons() {
		return weapons;
	}
	
	public void setWeapons(ArrayList<Weapon> weapons) {
		this.weapons = weapons;
	}
	
	public String getHitDiceRoll() {
		return hitDiceRoll;
	}
	
	public void setHitDiceRoll(String hitDiceRoll) {
		this.hitDiceRoll = hitDiceRoll;
	}
	
	public ArrayList<HitDice> getHealth() {
		return health;
	}
	
	public void setHealth(ArrayList<HitDice> health) {
		this.health = health;
	}
	
	public String getCombatConditions() {
		return combatConditions;
	}
	
	public void setCombatConditions(String combatConditions) {
		this.combatConditions = combatConditions;
	}
	
	public ArrayList<ArmorClass> getArmorClass() {
		return armorClass;
	}
	
	public void setArmorClass(ArrayList<ArmorClass> armorClass) {
		this.armorClass = armorClass;
	}
	
	public ArrayList<Item> getInventory() {
		return inventory;
	}
	
	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}
	
	public ArrayList<Skill> getSkills() {
		return skills;
	}
	
	public void setSkills(ArrayList<Skill> skills) {
		this.skills = skills;
	}
	
	public ArrayList<Feat> getFeats() {
		return feats;
	}
	
	public void setFeats(ArrayList<Feat> feats) {
		this.feats = feats;
	}
	
	public ArrayList<Casting> getCastings() {
		return castings;
	}
	
	public void setCastings(ArrayList<Casting> castings) {
		this.castings = castings;
	}
	
	public ArrayList<Spell> getSpells() {
		return spells;
	}
	
	public void setSpells(ArrayList<Spell> spells) {
		this.spells = spells;
	}
	
	public String getDomain() {
		return domain;
	}
	
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	public String getGreaterPower() {
		return greaterPower;
	}
	
	public void setGreaterPower(String greaterPower) {
		this.greaterPower = greaterPower;
	}
	
	public int getRagePerDay() {
		return ragePerDay;
	}
	
	public void setRagePerDay(int ragePerDay) {
		this.ragePerDay = ragePerDay;
	}
	
	public String getDuration() {
		return duration;
	}
	
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public int getAcPenalty() {
		return acPenalty;
	}
	
	public void setAcPenalty(int acPenalty) {
		this.acPenalty = acPenalty;
	}
	
	public int getRagesUsed() {
		return ragesUsed;
	}
	
	public void setRagesUsed(int ragesUsed) {
		this.ragesUsed = ragesUsed;
	}
}
