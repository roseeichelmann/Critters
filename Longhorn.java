import java.awt.Color;
import java.util.Random;
import java.util.Scanner;

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

public class Longhorn extends Critter {

	public Longhorn() {
		
	}
	
	/*
	 * Return Attack Scratch if opponent is hippo that is not hungry. Return Roar if opponent
	 * is hippo that is hungry. Return Roar if opponent looks like an ant. Return scratch
	 * if opponent looks like a bird or vulture. Else return pounce.
	 */
	public Attack fight(String opponent) {
		if(returnInt(opponent).equals("zero")) {
			return Attack.SCRATCH;
		}
		else if(returnInt(opponent).equals("greaterThanZero")) {
			return Attack.ROAR;
		}
		else if(opponent == "%") {
			return Attack.ROAR;
		} else if(opponent == "V" || opponent == ">" || opponent == "<" || opponent == "^") {
			return Attack.SCRATCH;
		} 
		return Attack.POUNCE;
	}
	
	/*
	 * Return color which is always orange.
	 */
	public Color getColor() {
		return Color.ORANGE;
	}
	
	/*
	 * Return whether the opponent string is composed of an int, and if that int is zero
	 * or greater than zero.
	 */
	public String returnInt(String opponent) {
		Scanner sc = new Scanner(opponent);
		if(sc.hasNextInt()) {
			if(sc.nextInt() == 0) {
				sc.close();
				return "zero";
			}
			sc.close();
			return "greaterThanZero";
		}
		sc.close();
		return "notInt";
	}
	
	/*
	 * Return random direction every move.
	 */
	public Direction getMove() {
		int north = 0;
		int east = 1;
		int south = 2;
		int numDirections = 4;
		int randomDirection;
		Random random = new Random();
		randomDirection = random.nextInt(numDirections);
		if(randomDirection == north) {
			return Direction.NORTH;
		} else if(randomDirection == east) {
			return Direction.EAST;
		} else if(randomDirection == south) {
			return Direction.SOUTH;
		} else {
			return Direction.WEST;
		}
	}
	
	/*
	 * Always return eat value of true
	 */
	public boolean eat() {
		return true;
	}
	
	/*
	 * Return string of longhorn.
	 */
	public String toString() {
		String antToString = "L";
		return antToString;
	}
	
}