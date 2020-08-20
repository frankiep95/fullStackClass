package projects;

import java.util.Scanner;


/**
 * This program will ask the user to input the value of change needed
 * the user will enter a value from 1 cent to 99 cents
 * the program will then output the amount of coins needed for that 
 * change amount.
 * @author Francisco Pereira
 * @date 08.16.2020
 * @version 1.0
 *
 */

public class changeMaker {
	
	/**
	 * main function to ask user for change due from 1 to 99 cents
	 * displays amount of coins needed for the input change amount
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int input = 0;
		
		System.out.println("Enter the amount of change needed from 1 to 99");
		input = scnr.nextInt();
		giveChange(input);
	}
	
	/**
	 * This module calculates the amount of change due in American standard
	 * values of coins
	 * 
	 * @param amount amount of change that needs to broken down to coins 1 for 1 cent 99 for 99 cents
	 */
	
	public static void giveChange(int amount) {
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		
		quarters = amount / 25; //divide amount by 25 to get amount of quarters
		amount %= 25;           // get the remainder of the amount using modulus function
		dimes = amount / 10;    //  repeat for all other coin values
		amount %= 10;
		nickels = amount / 5;
		amount %= 5;
		pennies = amount; // at this point what ever is left in amount is the amount of pennies
		
		System.out.println("The change due is: ");
		// output amount of quarters needed if more than 0
		if(quarters > 0) {
			//check if plural or singular label needed and display
			if(quarters == 1)System.out.println(quarters + " quarter");
			if(quarters > 1)System.out.println(quarters + " quarters");
		}
		
		// output amount of dimes needed if more than 0
		if(dimes > 0) {
			//check if plural or singular label needed and display
			if(dimes == 1)System.out.println(dimes + " dime");
			if(dimes >1)System.out.println(dimes + " dimes");
		}
		//output amount of nickels needed if more than 0
		if(nickels > 0) {
			//check if plural or singular label needed and display
			if(nickels ==1)System.out.println(nickels + " nickel");
			if(nickels > 1)System.out.println(nickels + " nickels");
		}
		//output amount of pennies needed if more than 0;
		if(pennies > 0) {
			//check if plural or singular label needed and display
			if(pennies == 1)System.out.println(pennies + " penny");
			if(pennies > 1)System.out.println(pennies + " pennies");
			
		}
		
		
	}

}
