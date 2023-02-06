package Entities;

public class Zombie extends Obstacle {

	public Zombie() {
		super("Zombie", 3, 10, 4, 3);
		System.out.println("There are " + this.getObstacleNumber() + " " + this.getName() + " here");

	}

}
