package Locations;

import java.util.Scanner;

import Entities.Player;

public class ToolStore extends Location {
	private Scanner scanner = new Scanner(System.in);

	// ARMORS
	// Light armor Block 1 Cost 15
	// Medium armor Block 3 Cost 25
	// Heavy armor Block 5 Cost 40

	// GUNS
	// Pistol Damage 2 Cost 25
	// Sword Damage 3 Cost 35
	// Rifle Damage 7 Cost 45

	public ToolStore(Player player) {
		super(player, "Tool Store");
		this.player = player;
		buyStuff();

	}

	private void buyStuff() {
		System.out.println("***** TOOL STORE *****");
		System.out.println("What do you want to buy ?");
		System.out.println("Your money is: " + player.getMoney());
		System.out.println("1 => Armors\n2 => Swords\n3 => Exit");
		int toolChoice = scanner.nextInt();
		while (toolChoice < 1 || toolChoice > 3) {
			System.err.println("Please enter a valid value!");
			toolChoice = scanner.nextInt();
		}
		switch (toolChoice) {
		case 1:
			getArmors();
			break;
		case 2:
			getGuns();
			break;
		case 3:
			break;
		}

	}

	private void getGuns() {
		System.out.println("1 => Pistol(25)\n2 => Sword(35)\n3 => Rifle(45)\n4 => Exit");
		int gunChoice = scanner.nextInt();
		while (gunChoice < 1 || gunChoice > 4) {
			System.err.println("Please enter a valid value!");
			gunChoice = scanner.nextInt();
		}
		switch (gunChoice) {
		case 1:
			if (player.getMoney() >= 25) {
				player.setDamage(player.getDamage() + 2);
				player.setMoney(player.getMoney() - 25);
				System.out.println("Your new damage is: " + player.getDamage());
			} else {
				System.out.println("You do not have enough money!");
			}
			break;
		case 2:
			if (player.getMoney() >= 35) {
				player.setDamage(player.getDamage() + 3);
				player.setMoney(player.getMoney() - 35);
				System.out.println("Your new damage is: " + player.getDamage());
			} else {
				System.out.println("You do not have enough money!");
			}
			break;
		case 3:
			if (player.getMoney() >= 45) {
				player.setDamage(player.getDamage() + 7);
				player.setMoney(player.getMoney() - 45);
				System.out.println("Your new damage is: " + player.getDamage());
			} else {
				System.out.println("You do not have enough money!");
			}

			break;
		case 4:
			buyStuff();
			break;
		default:
			buyStuff();
		}
	}

	private void getArmors() {
		System.out.println("1 => Light Armor(15)\n2 => Medium Armor(25)\n3 => Heavy Armor(40)\n4 => Exit");
		int armorChoice = scanner.nextInt();
		while (armorChoice < 1 || armorChoice > 4) {
			System.err.println("Please enter a valid value!");
			armorChoice = scanner.nextInt();
		}
		switch (armorChoice) {
		case 1:
			if (player.getMoney() >= 15) {
				player.setArmorAvoid(player.getArmorAvoid() + 1);
				player.setMoney(player.getMoney() - 15);
				System.out.println("Your new blocking damage is: " + player.getArmorAvoid());
			} else {
				System.out.println("You do not have enough money!");
			}
			break;
		case 2:
			if (player.getMoney() >= 25) {
				player.setArmorAvoid(player.getArmorAvoid() + 3);
				player.setMoney(player.getMoney() - 25);
				System.out.println("Your new blocking damage is: " + player.getArmorAvoid());
			} else {
				System.out.println("You do not have enough money!");
			}
		case 3:
			if (player.getMoney() >= 40) {
				player.setArmorAvoid(player.getArmorAvoid() + 5);
				player.setMoney(player.getMoney() - 40);
				System.out.println("Your new blocking damage is: " + player.getArmorAvoid());
			} else {
				System.out.println("You do not have enough money!");
			}
		case 4:
			buyStuff();
			break;
		default:
			buyStuff();
		}
	}

}
