import java.awt.*; // for color
import java.util.Random;

/**
* CS312 Assignment 11.
*
* On MY honor, Rose Eichelmann, this programming assignment is MY own work
* and I have not provided this code to any other student.
*
* Student name: Rose Eichelmann
* UTEID: ree585
* email address: rose.eichelmann@gmail.com
* Grader name: Tejna
* Number of slip days used on this assignment: 1
*
*/

public class Hippo extends Critter {
	private boolean hungry;
	private int hunger;
	private int randomDirection;
	private int moveCount;
	public static int NUM_DIRECTIONS = 4;
	
	/*
	 * Hippo constructed with hungry value of true unless hunger parameter is 0.
	 * Gives hippo first random direction.
	 */
	public Hippo(int hunger) {
		this.hunger = hunger;
		hungry = true;
		if(hunger == 0) {
			hungry = false;
		}
		Random random = new Random();
		randomDirection = random.nextInt(NUM_DIRECTIONS);
		moveCount = 0;
	}
	
	/*
	 * Return scratch if hungry else return pounce
	 */
	public Attack fight(String opponent) {
		if(hungry) {
			return Attack.SCRATCH;
		}
		return Attack.POUNCE;
	}
	
	/*
	 * Return gray if hungry else return white
	 */
	public Color getColor() {
		if(hungry) {
			return Color.GRAY;
		}
		return Color.WHITE;
	}
	
	/*
	 * Move 5 steps in a random direction, then choose new random
	 * direction and repeat
	 */
	public Direction getMove() {
		int startOfDirection = 1;
		int endOfDirection = 5;
		Random random = new Random();
		int north = 0;
		int east = 1;
		int south = 2;
		if(moveCount == endOfDirection) {
			randomDirection = random.nextInt(NUM_DIRECTIONS);
			moveCount = startOfDirection;
		} else {
			moveCount++;
		}
		Direction direction = Direction.CENTER;
		if(randomDirection == north) {
			direction = Direction.NORTH;
		} else if(randomDirection == east) {
			direction = Direction.EAST;
		} else if(randomDirection == south) {
			direction = Direction.SOUTH;
		} else {
			direction = Direction.WEST;
		}
		return direction;
	}
	
	/*
	 * Return true for the first (int hunger) times and then returns false
	 */
	public boolean eat() {
		if(hunger > 0) {
			hunger--;
		} else {
			hungry = false;
		}
		return hungry;
	}
	
	/*
	 * Return the number of pieces of food the hippo will still eat as string value
	 */
	public String toString() {
		String hippoToString = String.valueOf(hunger);
		return hippoToString;
	}
	
}
