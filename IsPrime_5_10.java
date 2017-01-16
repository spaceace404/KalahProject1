package Chapter5;
/**
 * 
5.10 (Use the isPrime Method) Listing 5.7, PrimeNumberMethod.java, provides the
isPrime(int number) method for testing whether a number is prime. Use this
method to find the number of prime numbers less than 10000.
 * @author kburnett
 *
 */
public class IsPrime_5_10 {

	public static void main(String[] args) {
	    System.out.print("Enter an integer: ");
	    java.util.Scanner input = new java.util.Scanner(System.in);
	    int number = input.nextInt();
	    reverse(number);
	  }

	  public static void reverse(int number) {
	    while (number != 0) {
	      int remainder = number % 10;
	      System.out.print(remainder);
	      number = number / 10;
	    }

	    System.out.println();
	  }
	}
