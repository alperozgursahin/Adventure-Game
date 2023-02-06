package Locations;

import Entities.Player;

public class ToolStore extends Location{

	public ToolStore(Player player) {
		super(player, "Tool Store");
		this.player = player;
		System.out.println("Welcome to the ToolStore");
		
	}

}
