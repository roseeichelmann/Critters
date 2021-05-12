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

public class Vulture extends Bird {
	private boolean hungry;
	
	/*
	 * Vulture starts with hungry value of true.
	 */
	public Vulture() {
		hungry = true;
	}
	
	/*
	 * Return color of vulture which is always blue.
	 */
	public Color getColor() {
		return Color.BLACK;
	}
	
	/*
	 * Vulture starts off hungry until it eats. After eating the vulture is no longer hungry. 
	 * It will not be hungry again until it is in a fight.
	 */
	public boolean eat() {
		if(hungry) {
			hungry = false;
			return true;
		}
		return false;
	}
	
	/*
	 * Return the same attack as bird but if vulture is in fight hungry will become true.
	 */
	public Attack fight(String opponent) {
		hungry = true;
		return super.fight(opponent);
	}
	
}
