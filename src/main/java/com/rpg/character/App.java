package com.rpg.character;

import com.rpg.character.models.Character;
import com.rpg.character.models.items.helms.LeatherHelm;

public class App {
	
	public static void main(String[] args) {
		Character character = new Character();
		
		character.getEquipedItems().setHelm(new LeatherHelm());
		
		System.out.println(character.toString());
		System.out.println(character.getStatus().toString());
		
	}
}
