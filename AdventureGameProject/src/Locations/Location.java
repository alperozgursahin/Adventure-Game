package Locations;

import Entities.Player;

public abstract class Location {
	protected Player player;
	protected String name;

	
	public Location(Player player, String name) {
		this.player = player;
		this.name = name;
	}


	public Player getPlayer() {
		return player;
	}


	public void setPlayer(Player player) {
		this.player = player;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
