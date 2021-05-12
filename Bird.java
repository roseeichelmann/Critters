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

public class Bird extends Critter {
	private int moveCount;
	private Direction currentDirection;
	private Direction nextDirection;
	
	/*
	 * Bird starts in north direction.
	 */
	public Bird() {
		moveCount = 0;
		currentDirection = Direction.NORTH;
		nextDirection = Direction.NORTH;
	}
	
	/*
	 * Return roar if opponent looks like an ant, otherwise
	 * return pounce.
	 */
	public Attack fight(String opponent) {
		String antToString = "%";
		if(opponent.equals(antToString)) {
			return Attack.ROAR;
		}
		return Attack.POUNCE;
	}
	
	/*
	 * Return color of bird which is always blue.
	 */
	public Color getColor() {
		return Color.BLUE;
	}
	
	/*
	 * Has critter return North 3x, then East 3x, then South 3x, then West 3x, and repeat.
	 */
	public Direction getMove() {
		moveCount++;
		int determineIfNextDirection = moveCount % 3;
		currentDirection = nextDirection;
		if(determineIfNextDirection == 0) {
			if(currentDirection == Direction.NORTH) {
				nextDirection = Direction.EAST;
			} else if(currentDirection == Direction.EAST) {
				nextDirection = Direction.SOUTH;
			} else if(currentDirection == Direction.SOUTH) {
				nextDirection = Direction.WEST;
			} else {
				nextDirection = Direction.NORTH;
			}
		}
		return currentDirection;
	}
	
	/*
	 * Return string value of "^" if last move was North or there has been no move,
	 *  ">" if last move was East, "V" if last move was South,
	 *  "<" if last move was West.
	 */
	public String toString() {
		if((currentDirection == Direction.NORTH) || (moveCount == 0)) {
			return "^";		
		} else if(currentDirection == Direction.EAST) {
			return ">";
		} else if(currentDirection == Direction.SOUTH) {
			return "V";
		} else {
			return "<";
		}
	}
	
}
