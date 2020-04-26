package com.client;

import java.util.Scanner;

public class Test1 {
	
	public static int menuSelection;
	static Scanner userInput = new Scanner(System.in);
	public static int cups;
	static int tsp = 48;
	static int cupsToTsp = cups * tsp;
	public static int miles;
	static double km = 1.60934;
	static double milesToKm = miles * km;
	public static int usGal;
	static double impGal = 0.832674;
	static double usToImp = usGal * impGal;
	
	public static void main(String[] args) {
		while (menuSelection != 4) {
			Scanner in = new Scanner(System.in);
			System.out.println("Please select an option:\n"
							+ "1. Cups to Teaspoons\n"
							+ "2. Miles to Kilometers\n"
							+ "3. US Gallons to Imperial Gallons\n"
							+ "4. Quit");
		
			menuSelection = in.nextInt();
			
			switch (menuSelection) {
			case 1:
				System.out.println("Enter a number of cups to convert to teaspoons");
				int cups = in.nextInt();
				System.out.println(cups + " cups is " + cupsToTsp + " teaspoons");
				break;
				
			case 2:
				System.out.println("Enter a number of miles to convert to kilometers");
				int miles = in.nextInt();
				System.out.println(miles + " miles is " + milesToKm + " kilometers");
				break;
			
			case 3:
				System.out.println("Enter a number of US gallons to convert to Imperial gallons");
				int usGal = in.nextInt();
				System.out.println(usGal + " US gallons is " + usToImp + " Imperial gallons");
				break;
				
			case 4:
				break;
			}
		}
	}

}
