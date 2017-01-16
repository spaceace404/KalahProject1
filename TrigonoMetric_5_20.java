package Chapter5;

/**
 * 
 5.20 (Use trigonometric methods) Print the following table to display the sin value and
cos value of degrees from 0 to 360 with increments of 10 degrees. Round the
value to keep four digits after the decimal point.
 * @author kburnett
 *
 */
public class TrigonoMetric_5_20 {
	 
	  public static void main(String[] args) {
		    System.out.println("Degree\tSin\t\tCos");

		    for (int degree = 0; degree <= 360; degree += 10) {
		      System.out.printf("%-3d\t%6.4f\t\t%6.4f\n", degree,
		        Math.sin(degree * Math.PI / 180),
		        Math.cos(degree * Math.PI / 180));
		    }
		  }

		 
		  public static double format(double d, int position) {
		    return Math.round(d * Math.pow(10, position)) / Math.pow(10, position);
		  } 
		}

