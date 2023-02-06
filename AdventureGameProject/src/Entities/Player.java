package Entities;

import java.util.Scanner;

public class Player {

	private String name;
	private int damage;
	private int health;
	private int money;
	private int defDamage;
	private int defHealth;
	private int defMoney;
	private boolean isAlive;
	private int armorAvoid;

	Scanner scanner = new Scanner(System.in);

	public Player() {
		selectChar();
	}

	public void selectChar() {
		System.out.println("Select Character");
		System.out.println("1 => SAMURAI\n2 => ARCHER\n3 => KNIGHT\n4 => Exit");
		int choice = scanner.nextInt();
		while (choice < 1 || choice > 4) {
			System.err.println("Please enter a valid value!");
			choice = scanner.nextInt();
		}

		switch (choice) {
		case 1:
			playerAttributes("Samurai", 5, 21, 100);
			break;
		case 2:
			playerAttributes("Archer", 7, 18, 20);
			break;
		case 3:
			playerAttributes("Knight", 8, 24, 5);
			break;
		case 4:
			isAlive = false;
			break;
		}

	}

	public void playerAttributes(String name, int damage, int health, int money) {
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.money = money;
		this.setDefHealth(health);
		this.setDefDamage(damage);
		this.setDefMoney(money);
		this.armorAvoid = 0;
		this.isAlive = true;
		System.out.println(name + " >>" + " Damage: " + damage + " | Health: " + health + " | Money: " + money);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getDefDamage() {
		return defDamage;
	}

	public void setDefDamage(int defDamage) {
		this.defDamage = defDamage;
	}

	public int getDefHealth() {
		return defHealth;
	}

	public void setDefHealth(int defHealth) {
		this.defHealth = defHealth;
	}

	public int getDefMoney() {
		return defMoney;
	}

	public void setDefMoney(int defMoney) {
		this.defMoney = defMoney;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public int getArmorAvoid() {
		return armorAvoid;
	}

	public void setArmorAvoid(int armorAvoid) {
		this.armorAvoid = armorAvoid;
	}

}
