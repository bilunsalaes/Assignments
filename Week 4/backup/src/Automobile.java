// Michael Martin
// M4A1 Programming Assignment 4
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import java.util.*;

	public class Automobile
	{
		
		
		// Constructor
		public Automobile(int autoID, String make, String model, String color, int year, int vinNumber, double milesPerGallon, int speed, int brake) 
			{
					
			setAutoID(autoID);
			make = make;
			model = model;
			color = color;
			setYear(year);
			setVinNumber(vinNumber);
			setMilesPerGallon(milesPerGallon);
			speed = 0;
			brake = brake;
								
			}
	
	 		
		// Private Fields 
		private static int autoID;
		private static String make;
		private static String model;
		private String color;
		private int year;
		private int vinNumber;
		private double milesPerGallon;
		private static int speed;
		private static int brake;
		private static int speedIncrease;
		private static int speedDecrease;
		
		// Public Fields
		
		
		Scanner input = new Scanner(System.in);
		
		// Get values
		public static int getAutoID() { return autoID;}
		public static String getMake() { return make;}
		public static String getModel() { return model;} 
		public String getColor() { return color;}
		public int getYear() { return year;}
		public int getVinNumber() { return vinNumber;}
		public double getMilesPerGallon() {return milesPerGallon;}
		public static int getSpeed() {return speed;}
		public static int getBrake() {return brake;}
		public Scanner scan = new Scanner (System.in);
		
		// This is the automobile that you just input.
		
				
		// Set values Below
		
		// Do not allow the ID to be negative or more than 9999; if it is, set the ID to 0. 
		public void setAutoID(int autoID) { 
			
			while (autoID <= -1 || autoID >= 10000)
			{
				System.out.println("Please enter a valid auto ID that is between 1-9999." ); 
				autoID = input.nextInt();
			}
					autoID = autoID;
		}				
		public void setMake(String make) { make = make;}
		public void setModel(String model ) { model = model;} 
		public void setColor(String color) { color = color;}
		
		//Do not allow the year to be earlier than 2000 or later than 2017; if it is, set the year to 0. 
		public void setYear(int year) {
			while (year <= 1999 || year >=2018) {
				System.out.println("Please enter a valid year between 2000 and 2017." ); 
				year = input.nextInt();
			}
				year = year;
		}
		public void setVinNumber(int vinNumber) { vinNumber = vinNumber;}
		
		//Do not allow the miles per gallon to be less than 10 or more than 60; if it is, set the miles per gallon to 0. 
		public void setMilesPerGallon(double milesPerGallon) {
			
			while (milesPerGallon <= 9 || milesPerGallon >= 61) {
				
				System.out.println("\nPlease enter a valid miles per gallon between 10 and 60." );
				milesPerGallon = input.nextDouble();
			}			
				milesPerGallon = milesPerGallon;
		}
		
		public void setSpeed(int speed) {speed = speed;}
		public void setBrake(int brake) {brake = brake;}
		
		// Accelerate and Brake
		//accelerate = speed +=5;
		//brake = speed -=5;
		
		 //Methods for overloading Speed Up and Braking
		
		public static void speedUp(){
			{
		if(speed >= 0 && speed <= 100)
		speed += 5;}}
		
		//System.out.println("\nYour current speed is " + getSpeed() + " miles per hour. ");}
		
		public static void brake()
		{speed -= 5;}
		
		//System.out.println("\nYour current speed is " + getSpeed() + " miles per hour. ");}
		
		// Return speed
		
		
		
		
		/*public static void speedUp() {
			for(speed = 0; speed < 50; ++speed) {
				System.out.println("You have reached the maximum speed.  Please slow down.");
			}
			speed = 5;
			while(speed < 50)
				{
				System.out.println(speed);
				++speed;}
			
		}
		
		public static void decelerate() {
			for(speed=50; speed>= 50; ++brake) {
				System.out.println(brake);
			}    
			brake = 5;
			while(speed >= 50){
			System.out.println(brake);
			++brake;}
			{System.out.println("You are wearing out the brakes because you have already stopped. ");}
		}*/
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
 
