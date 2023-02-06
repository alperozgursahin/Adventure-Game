package Locations;

import Entities.Player;
import Entities.Vampire;

public class Forest extends BattleLoc {

	public Forest(Player player) {
		super(player, new Vampire());

	}

}
