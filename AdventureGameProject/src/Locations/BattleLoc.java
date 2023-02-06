package Locations;

import Entities.Player;

public abstract class BattleLoc extends Location{

	public BattleLoc(Player player) {
		super(player,"Battle Locations");
		fightLocations();
		
		
	}

	private void fightLocations() {
		System.out.println("Which fight location to you want to go?");
		
	}

	
	
}
