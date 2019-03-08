package com.rpg.character.models;

import java.util.Arrays;
import java.util.List;

public class Character {

	private String name;
	private EquipedItems equipedItems = new EquipedItems();
	private Inventory inventory = new Inventory();
	private Status status = new Status();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EquipedItems getEquipedItems() {
		return equipedItems;
	}

	public void setEquipedItems(EquipedItems equipedItems) {
		this.equipedItems = equipedItems;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	// TODO tá feio, precisa ser algo tipo addItem e o status altera...
	public Status getStatus() {
		List<Item> itens = Arrays.asList(
				this.getEquipedItems().getArmor(),
				this.getEquipedItems().getArms(),
				this.getEquipedItems().getBoots(),
				this.getEquipedItems().getHelm());
		
		itens.forEach(i -> {
				if (i != null) { 
					this.status.setAgi(this.status.getAgi() + i.getStatus().getAgi());
				}});
		itens.forEach(i -> {
			if (i != null) { 
				this.status.setStr(this.status.getStr() + i.getStatus().getStr());
			}});
		
		return status;
	}

	@Override
	public String toString() {
		return "Character [name=" + name + ", equipedItems=" + equipedItems + ", inventory=" + inventory + ", status="
				+ status + "]";
	}

}
