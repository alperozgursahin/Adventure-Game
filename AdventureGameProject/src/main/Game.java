package main;

import java.util.Scanner;

import Entities.Player;
import Locations.Cave;
import Locations.Forest;
import Locations.River;
import Locations.SafeHouse;

public class Game {

	private Player player;
	private Scanner scanner = new Scanner(System.in);

	public Game() {

		player = new Player();
		while (player.isAlive()) {
			start();
		}
		System.out.println("Game is finished!");

	}

	private void start() {
		System.out.println();
		System.out.println("Where want do you go?");
		System.out.println("1 => SafeHouse\n2 => Battle\n3 => Exit");
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
			selectBattleMap();
			break;
		case 3:
			player.setAlive(false);
			break;
		}

	}

	private void selectBattleMap() {
		System.out.println("Which map do yo want to go?");
		System.out.println("1 => Forest\n2 => Cave\n3 => River\n4 => exit.");
		int battleMapChoice = scanner.nextInt();
		while (battleMapChoice < 1 || battleMapChoice > 4) {
			System.err.println("Please Enter a valid value!");
			battleMapChoice = scanner.nextInt();
		}
		switch (battleMapChoice) {
		case 1:
			System.out.println("Going to the Forest...");
			new Forest(player);
			break;
		case 2:
			System.out.println("Going to the Cave...");
			new Cave(player);
			break;
		case 3:
			System.out.println("Going to the River...");
			new River(player);
			break;
		}

	}
}
