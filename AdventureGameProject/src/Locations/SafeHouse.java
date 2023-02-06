package Locations;

import java.util.Scanner;

import Entities.Player;

public class SafeHouse extends Location {
	
	private Scanner scanner = new Scanner(System.in);
	private Player player;

	public SafeHouse(Player player) {
		super(player, "SafeHouse");
		this.player = player;
		regenerate();
		toolStore();

	}

	private void regenerate() {
		System.out.println("Welcome to the SafeHouse");
		System.out.println("Your health is regenerated!");
		player.setHealth(player.getDefHealth());

	}

	private void toolStore() {
		System.out.println("Do you want to go Tool Store?");
		System.out.println("1 for go\n2 for exit");
		int goToolStore = scanner.nextInt();
		while (goToolStore < 1 || goToolStore > 2) {
			System.err.println("Enter a valid value!");
			goToolStore = scanner.nextInt();
		}
		switch (goToolStore) {
		case 1:
			new ToolStore(player);
			break;

		}
	}

}
