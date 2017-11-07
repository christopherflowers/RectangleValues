package uwstout.cs144.labs.lab02;

import java.util.Scanner;

/**
 * This computes the area and perimeter of a rectangle given the rectangle's
 * length and width.
 * 
 * @author turners
 * @version 2016-09-12
 *
 */
public class RectangleValues {

	/**
	 * This computes the area and perimeter of a rectangle given the rectangle's
	 * length and width.
	 * 
	 * 
	 * @param args
	 *            Command line arguments (not used)
	 * 
	 * 
	 * 
	 *            Input: length = 10 width =5 Expected:area = 50 perimeter = 30
	 * 
	 * 
	 *            Input:length = 2.5 width = 3.3 Expected:area = 8.25 perimeter
	 *            = 11.6
	 * 
	 * 
	 *            Input: length = 0 width = 5 Expected:ERROR not a rectangle
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		double length;
		double width;
		double perimeter;
		double area;

		// Create an object to read in data from the keyboard
		Scanner scan = new Scanner(System.in);
		// prompt for and read in length and width
		System.out.println("Enter the length of the rectangle: ");
		length = scan.nextDouble();

		System.out.println("Enter the width of the rectangle: ");
		width = scan.nextDouble();

		// compute perimeter and area
		perimeter = 2 * (length + width);
		area = length * width;

		// output results
		System.out.println("For a " + length + " x " + width + " rectangle...");
		System.out.println("The perimiter is " + perimeter);
		System.out.println("The area is " + area);

		scan.close();
	}
}
