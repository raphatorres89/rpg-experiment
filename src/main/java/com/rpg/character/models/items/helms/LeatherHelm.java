package com.rpg.character.models.items.helms;

import com.rpg.character.models.Status;
import com.rpg.character.models.items.Helm;

public class LeatherHelm extends Helm {

	public LeatherHelm() {
		super.setStatus(new Status(0, 5));
		super.setName("Leather Helm");
	}
	
}
