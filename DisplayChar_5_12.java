package Chapter5;

/**
 * 
 5.12 (Display characters) Write a method that prints characters using the following
header:
public static void printChars(char ch1, char ch2, int
numberPerLine)
This method prints the characters between ch1 and ch2 with the specified numbers
per line. Write a test program that prints ten characters per line from 1 to Z.
Characters are separated by exactly one space.
 * @author kburnett
 *
 */
public class DisplayChar_5_12 {

	public static void main(String[] args) {
	      printChars('1', 'Z', 10);
	  }

	  public static void printChars(char ch1, char ch2, int numberPerLine) {
	      int count = 1;
	      
	      for (int i = ch1; i <= ch2; i++, count++)
	        if (count % numberPerLine == 0)
	      
	        	System.out.println((char)i);
	        else
	          System.out.print((char)i);
	  }
	}