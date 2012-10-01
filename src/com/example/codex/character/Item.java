package com.example.codex.character;

public class Item {

	private String name = "";
	private int weight = 0;
	private String location = "";
	private boolean magic = false;
	private boolean equipped = false;
	private String notes = "";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public boolean isMagic() {
		return magic;
	}
	
	public void setMagic(boolean magic) {
		this.magic = magic;
	}
	
	public boolean isEquipped() {
		return equipped;
	}
	
	public void setEquipped(boolean equipped) {
		this.equipped = equipped;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
