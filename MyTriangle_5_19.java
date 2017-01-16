package Chapter5;
/**
 * 
 *5.19 (The MyTriangle class) Create a class named MyTriangle that contains the
following two methods:
public static boolean isValid(
double side1, double side2, double side3)
public static double area(
double side1, double side2, double side3)
Write a test program that reads three sides for a triangle and computes the area if
the input is valid. Otherwise, it displays that the input is invalid. The formula for
computing the area of a triangle is given in Programming Exercise 2.15. 
 * @author kburnett
 *
 */
 
import java.util.Scanner;

import java.text.*;




	public class MyTriangle_5_19

	{
	   public static void main(String[] args)

	 {

	      Scanner input = new Scanner(System.in);

	         boolean valid = true;

	         double side1, side2, side3, area, s;

	 

	      System.out.print("Please enter side1: ");

	      side1 = input.nextDouble();

	     

	      System.out.print("Please enter side2: ");

	      side2 = input.nextDouble();

	           

	      System.out.print("Please enter side3: ");

	      side3 = input.nextDouble();



	      valid = isValid(side1, side2, side3);

	       

	           

	      if(valid)

	      {

	         area = (side1 * side2 * side3);

	            

	        

	      System.out.print("The area of the triangle is: " + area);

	      }

	      else             

	      System.out.println("The input is not valid");

	   }



	   public static boolean isValid(double side1, double side2, double side3)

	   {

	        return(((side1 + side2) >side3) && ((side2 + side3) > side1) && ((side3 + side1) >side2));

	   }



	   public static double area(double side1, double side2, double side3)

	   {

	        double s = (side1 + side2 + side3)/2;

	        double area = Math.sqrt(s * (s - side1) * (s - side3));

	        return area;

	   }

	}
