package main;

import java.util.Scanner;

import Entities.Player;
import Locations.BattleLoc;
import Locations.Location;
import Locations.SafeHouse;

public class Game {

	private Player player;
	private Location location;
	private Scanner scanner = new Scanner(System.in);

	public Game() {

		player = new Player();
		while (player.isAlive()) {
			start();
		}
		System.out.println("Game is finished!");
		

	}

	public void start() {
		System.out.println("Where want do you go?");
		System.out.println("1 for SafeHouse\n2 for Battle\n3 for Exit:");
		int locationChoice = scanner.nextInt();
		while (locationChoice < 1 || locationChoice > 3) {
			System.err.println("Please enter a valid value!");
			locationChoice = scanner.nextInt();
		}
		switch (locationChoice) {
		case 1:
			new SafeHouse(player);
			break;
		case 2:
			break;
		case 3:
			break;
		}

	}
}
