package Entities;

public class Vampire extends Obstacle {

	public Vampire() {
		super("Vampire", 4, 14, 7, 3);
		System.out.println("There are " + this.getObstacleNumber() + " " + this.getName() + " here");

	}

}
