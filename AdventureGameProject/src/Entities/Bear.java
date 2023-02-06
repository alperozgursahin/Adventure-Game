package Entities;

public class Bear extends Obstacle {

	public Bear() {
		super("Bear", 7, 20, 12, 3);
		System.out.println("There are " + this.getObstacleNumber() + " " + this.getName() + " here");

	}

}
