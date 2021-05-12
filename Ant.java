import java.awt.*; // for color

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


public class Ant extends Critter {
	private Direction firstDirection;
	private Direction secondDirection;
	private int moveCount;
	
	/*
	 * If ant constructed with walkSouth of true, first direction will be south, else
	 * it will be north. Second direction is always east.
	 */
	public Ant(boolean walkSouth) {
		moveCount = 0;
		secondDirection = Direction.EAST;
		if(walkSouth) {
			firstDirection = Direction.SOUTH;
		} else {
			firstDirection = Direction.NORTH;		
		}
	}
	
	/*
	 * Return attack value of scratch.
	 */
	public Attack fight(String opponent) {
		return Attack.SCRATCH;
	}
	
	/*
	 * Return color which is always red.
	 */
	public Color getColor() {
		return Color.RED;
	}
	
	/*
	 * If Ant constructed with walkSouth value of true then alternate between S and E
	 * in a zigzag and if false then alternate between N and E.
	 */
	public Direction getMove() {
		moveCount++;
		int findDirection = moveCount % 2;
		if(findDirection == 1) {
			return firstDirection;
		}
		return secondDirection;
	}
	
	/*
	 * Always return eat value of true.
	 */
	public boolean eat() {
		return true;
	}
	
	/*
	 * Return string of ant.
	 */
	public String toString() {
		String antToString = "%";
		return antToString;
	}
}
