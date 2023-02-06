package Locations;

import Entities.Player;
import Entities.Zombie;

public class Cave extends BattleLoc {

	public Cave(Player player) {
		super(player, new Zombie());

	}

}
