package com.rpg.character.models;

import com.rpg.character.models.items.Armor;
import com.rpg.character.models.items.Arms;
import com.rpg.character.models.items.Boots;
import com.rpg.character.models.items.Helm;

public class EquipedItems {

	private Item helm;
	private Item armor;
	private Item boots;
	private Item arms;

	public Item getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Item getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public Item getBoots() {
		return boots;
	}

	public void setBoots(Boots boots) {
		this.boots = boots;
	}

	public Item getArms() {
		return arms;
	}

	public void setArms(Arms arms) {
		this.arms = arms;
	}

	@Override
	public String toString() {
		return "EquipedItems [helm=" + helm + ", armor=" + armor + ", boots=" + boots + ", arms=" + arms + "]";
	}

}
