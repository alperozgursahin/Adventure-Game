package Entities;

import java.util.Random;

public class Obstacle {
	private String name;
	private int health;
	private int damage;
	private int money;
	private int maxNumber;
	private int obstacleNumber;
	private int defHealth;

	public Obstacle(String name, int damage, int health, int money, int maxNumber) {

		this.maxNumber = maxNumber;
		this.name = name;
		this.health = health;
		this.damage = damage;
		this.money = money;
		this.setDefHealth(health);
		randomObstacleNumber(maxNumber);
	}

	public void randomObstacleNumber(int maxNumber) {
		Random random = new Random();
		obstacleNumber = random.nextInt(maxNumber) + 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMaxNumber() {
		return maxNumber;
	}

	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}

	public int getObstacleNumber() {
		return obstacleNumber;
	}

	public void setObstacleNumber(int obstacleNumber) {
		this.obstacleNumber = obstacleNumber;
	}

	public int getDefHealth() {
		return defHealth;
	}

	public void setDefHealth(int defHealth) {
		this.defHealth = defHealth;
	}

}
