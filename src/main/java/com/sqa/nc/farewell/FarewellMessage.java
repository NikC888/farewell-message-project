/**
 *   File Name: FarewellMessage.java<br>
 *
 *   Cui, Nicolas<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 24, 2016
 *
 */

package com.sqa.nc.farewell;

import java.util.*;

/**
 * FarewellMessage //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class FarewellMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// welcome the user
		System.out.println("Welcome to my Farewell Application!");
		// ask the user for their name
		System.out.print("Could I have your name please:");
		// create the Scanner OBject to allow input from console
		Scanner scanner = new Scanner(System.in);
		// collect their name in a local variable name of type string
		String name = scanner.nextLine();
		// say good bye to the user
		System.out.println("Thank you for using my simple application, " + name);
		// wish them a great day
		System.out.println("Have a great day!");
	}

}
