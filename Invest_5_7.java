package Chapter5;

/**
 * 
 (Financial application: compute the future investment value) Write a method that
computes future investment value at a given interest rate for a specified number of
years. The future investment is determined using the formula in Programming
Exercise 2.21.
Use the following method header:
public static double futureInvestmentValue(
double investmentAmount, double monthlyInterestRate, int years)
For example, futureInvestmentValue(10000, 0.05/12, 5) returns
12833.59.
Write a test program that prompts the user to enter the investment amount (e.g.,
1000) and the interest rate (e.g., 9%) and prints a table that displays future value
for the years from 1 to 30, as shown below:
 * 
 */

import java.util.Scanner;


public class Invest_5_7 {

	  static Scanner input = new Scanner(System.in);



	  public static void main(String[] args) {

	      System.out.print("Enter investment amount: ");

	      double investmentAmount = input.nextDouble();

	      System.out.print("Enter Yearly interest rate amount: ");

	      double yearlyInterestRate = input.nextDouble();

	      double monthlyInterestRate = ((yearlyInterestRate / 1200));



	      System.out.println("The amount invested: " + investmentAmount);

	      System.out.println("Annual interest rate: " + yearlyInterestRate + "%");

	      System.out.println("Years       Future Value");

	      for (int i = 1; i < 31; i++) {

	          System.out.println(i + "          " + futureInvestment(

	                  investmentAmount, monthlyInterestRate, i));

	      }

	  }



	  public static double futureInvestment(double investAmount,

	          double monthlyInterestRate, int i) {



	      double YearlyInterest = (investAmount * (Math.pow(1 +

	              monthlyInterestRate, i * 12)));

	      return (YearlyInterest);

	  }

	}

