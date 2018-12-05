// Michael Martin
// M4A1 Programming Assignment 4

import java.util.Scanner;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JOptionPane;



	public class TestAutomobiles
	{
				
		
		public static void main(String[] args) 
		{
			Scanner input = new Scanner(System.in);
				int counter = 0;
				int autoID = 0;
				String make;
				String model;
				String color;
				int year = 0;
				int vinNumber;
				double milesPerGallon;
				int speed = 0;
				int brake;
				
	
				
			
			
			while((counter <= 2 )) {counter ++;} {
			
			System.out.println("Please enter the autoID, make, model, color, year, vinNumber, milesPerGallon. " +  
			"your automobile's test speed and test braking power.  Press enter to continue. ");
			
			
			
			//Inputs
			System.out.print("\nPlease enter your auto ID >> ");
			autoID = input.nextInt();
			System.out.println("\nYou have entered " + autoID + " as your Auto ID. ");
			input.nextLine();
			System.out.println("\nPlease enter your automobile's make >> ");
			make = input.nextLine();
			System.out.println("\nYou have entered " + make + " as your make. ");
			//input.nextLine();
			System.out.println("\nPlease enter your automobile's model >> ");
			model = input.nextLine();
			System.out.println("\nYou have entered " + model + " as your model. ");
			//input.nextLine();
			System.out.println("\nPlease enter your automobile's color >> ");
			color = input.nextLine();
			System.out.println("\nYou have entered " + color + " as your color. ");
			//input.nextLine();
			System.out.println("\nPlease enter your automobile's year >> ");
			year = input.nextInt();
			System.out.println("\nYou have entered " + year + " as your year. ");
			//input.nextLine();
			System.out.println("\nPlease enter your automobile's vin number >> ");
			vinNumber = input.nextInt();
			System.out.println("\nYou have entered " + vinNumber + " as your vin number. ");
			//input.nextLine();
			System.out.println("\nPlease enter your automobile's miles per gallon.  Decimals are allowed >> ");
			milesPerGallon = input.nextDouble();
			System.out.println("\nYou have entered " + milesPerGallon + " as your miles per gallon. ");
			//input.nextLine();
			System.out.println("\nPlease enter your automobile's test speed >> ");
			speed = input.nextInt();
			System.out.println("\nYou have entered " + speed + " as your test speed. ");
			
			//Speed Up
			for (int i=0; i<10; i++){
				if(i >=0 && i <= 100)
				Automobile.speedUp();
				//System.out.println();
				System.out.println("The " + Automobile.getMake() + " " + Automobile.getModel() + 
						"is accelerating");
				System.out.println("Your current speed is: " + Automobile.getSpeed());}
				//input.nextLine();
			System.out.println("\nPlease enter your automobile's test braking power >> ");
			brake = input.nextInt();
			System.out.println("\nYou have entered " + brake + " as your test braking power. ");
			//Slow Down
			for (int i=0; i<10; i++) {
				if(i>=0 && i<= 100)
				Automobile.brake();
				//System.out.println();
				System.out.println("The " + Automobile.getMake() + " " + Automobile.getModel() + 
						"is slowing down");
				System.out.println("Now your speed is: " + Automobile.getSpeed());}
			//input.nextLine();
			
			// Automobile Object made from constructor within While Loop
			Automobile automobile = new Automobile(autoID, make, model, color, year, vinNumber, milesPerGallon, speed, brake);
			input.nextLine();
			
			System.out.println("\nThe year, make and model of your car is a " + year + " " + make + " " + model + " ");
			
			System.out.println("\nWelcome to my program.  If you would like toquit press 'q'.  If you would" 
					+ "like to test the speed, press 's'.  If you would like to test the brakes, press 'b'.  Thank you. " );
			Scanner projectChoice = new Scanner (System.in);
			
							
			String answer = projectChoice.next();
			
			if(answer.equals('a') || answer.equals('A'))
					Automobile.speedUp();
					
			else if(answer.equals('b') || answer.equals('B'))
		    		Automobile.brake();
			
			else if(answer.equals("q") || answer.equals("Q"))
					System.out.println("Thank you for testing. ");
					System.exit(1);}
			
						
				
				/*System.out.println( "Vroom vroom...." );
				for(int seconds = 1; seconds <= 4; seconds ++) {
					Automobile.speedUp();
					System.out.println( "The current speed is" + speed + " miles per hour ");
					}
				
				System.out.println( "eeeek.....");
				for(int seconds = 1; seconds <= 4; seconds ++) {
					Automobile.decelerate();
				    System.out.println( "The current speed is" + speed + " miles per hour ");} */ 
				
							
					}
			
		}
	
	
	
		
		
			
	


/*Create an Automobile class for a dealership. Include fields for an 
 * ID number, make, model, color, year, vin number, miles per gallon, and speed. 
 * Include get and set methods for each field. 
 * Do not allow the ID to be negative or more than 9999; if it is, set the ID to 0. 
 * Do not allow the year to be earlier than 2000 or later than 2017; if it is, set the year to 0. 
 * Do not allow the miles per gallon to be less than 10 or more than 60; if it is, set the miles per gallon to 0. 
 * Car speed should be initialized as 0. 
 * Include a constructor that accepts arguments for each field value and uses the set methods to assign the values. 
 * Also write two methods, Accelerate () and Brake (). 
 * Whenever Accelerate () is called, increase the speed by 5, and whenever Brake () is called, decrease the speed by 5. 
 * To allow users to specify the speed to increase (or decrease), create two overloading methods for Accelerate () and Brake () that accept a single parameter specifying the increasing (or decreasing) speed. 
 * Write an application that declares several Automobile objects and demonstrates that all the methods work correctly. 
 * Save the files as Automobile.java and TestAutomobiles.java.*/
 