package Locations;

import java.util.Scanner;

import Entities.Obstacle;
import Entities.Player;

public abstract class BattleLoc extends Location {
	private Obstacle obstacle;
	private Scanner scanner = new Scanner(System.in);

	public BattleLoc(Player player, Obstacle obstacle) {
		super(player, "Battle Locations");
		this.obstacle = obstacle;
		fightOrNot();

	}

	private void fightOrNot() {
		System.out.println(obstacle.getName() + " || Damage: " + obstacle.getDamage() + " Health: "
				+ obstacle.getHealth() + " Money: " + obstacle.getMoney());
		System.out.println("Your stats | Health: " + player.getHealth() + " Damage: " + player.getDamage()
				+ " Armor Avoid: " + player.getArmorAvoid() + " Money: " + player.getMoney());
		System.out.println("<F>ight or <E>xit");
		String fightChoice = scanner.next();
		if (fightChoice.toLowerCase().equals("f")) {
			for (int i = 0; i < obstacle.getObstacleNumber(); i++) {
				System.out.println("Round: "+i);
				while (obstacle.getHealth() > 0) {
					if (obstacle.getDamage() > player.getArmorAvoid())
						player.setHealth(player.getHealth() - obstacle.getDamage() + player.getArmorAvoid());
					obstacle.setHealth(obstacle.getHealth() - player.getDamage());
					if (player.getHealth() <= 0) {
						player.setAlive(false);
						break;
					}
				}
				System.out.println("PLAYER HEALTH: " + player.getHealth());
				if (player.getHealth() <= 0) {
					player.setAlive(false);
					break;
				}
				player.setMoney(player.getMoney() + obstacle.getMoney());
				obstacle.setHealth(obstacle.getDefHealth());
			}
		} else {
			System.out.println("What a coward..");
		}
		if (fightChoice.toLowerCase().equals("f") && player.isAlive()) {
			System.out.println("You killed all " + obstacle.getName() + "(s). You earned "
					+ obstacle.getMoney() * obstacle.getObstacleNumber() + "$");
			System.out.println("Your new stats | Health: " + player.getHealth() + " | Damage: " + player.getDamage()
					+ " | Armor Avoid: " + player.getArmorAvoid() + " | Money: " + player.getMoney());
		}

	}

}
